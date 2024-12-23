package com.example.demo;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class ChatWebSocketHandler extends TextWebSocketHandler {

    private final Map<String, WebSocketSession> sessions = new ConcurrentHashMap<>();
    private final ObjectMapper objectMapper = new ObjectMapper();

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ChatRoomRepository chatRoomRepository;

    @Autowired
    private MessageRepository messageRepository;

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        String username = (String) session.getAttributes().get("username");
        if (username != null) {
            sessions.put(username, session);
        }
    }

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        Map<String, Object> payload = objectMapper.readValue(message.getPayload(), Map.class);
        String type = (String) payload.get("type");
        String username = (String) session.getAttributes().get("username");

        if ("SET_USERNAME".equals(type)) {
            session.getAttributes().put("username", username);
            sessions.put(username, session);
        } else if ("CREATE_CHAT_ROOM".equals(type)) {
            String[] usernames = ((String) payload.get("users")).split(",");
            List<String> usernameList = List.of(usernames);
            List<User> users = userRepository.findAllByUsernameIn(usernameList);

            ChatRoom chatRoom = new ChatRoom();
            chatRoom.setUsers(Set.copyOf(users));
            chatRoomRepository.save(chatRoom);

            for (User user : users) {
                WebSocketSession userSession = sessions.get(user.getUsername());
                if (userSession != null && userSession.isOpen()) {
                    userSession.sendMessage(new TextMessage("Chat room created: " + chatRoom.getId()));
                }
            }
        } else if ("MESSAGE".equals(type)) {
            Long chatRoomId = ((Number) payload.get("chatRoomId")).longValue();
            String content = (String) payload.get("content");

            User sender = userRepository.findByUsername(username);
            ChatRoom chatRoom = chatRoomRepository.findById(chatRoomId).orElse(null);

            if (sender != null && chatRoom != null) {
                Message msg = new Message();
                msg.setSender(sender);
                msg.setContent(content);
                msg.setChatRoom(chatRoom);
                msg.setTimestamp(LocalDateTime.now());
                messageRepository.save(msg);

                for (User user : chatRoom.getUsers()) {
                    WebSocketSession recipientSession = sessions.get(user.getUsername());
                    if (recipientSession != null && recipientSession.isOpen()) {
                        recipientSession.sendMessage(new TextMessage(username + ": " + content));
                    }
                }
            }
        }
    }


    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
        String username = (String) session.getAttributes().get("username");
        if (username != null) {
            sessions.remove(username);
        }
    }
}
