package parkseongmin;

import java.util.HashSet;
import java.util.Set;

public class HashSet_ {

	public static void main(String[] args) {
		
		Set<TextMessage> msgSet = new HashSet<>();
		
		//TextMessage 생성 -> 인스턴스 -> 클래스의 공간을 HashSet(중복을 체크한다)
		TextMessage msg1 = new TextMessage(1001,"안녕하세요");
		TextMessage msg2 = new TextMessage(1001,"안녕하세요");
		TextMessage msg3 = new TextMessage(1001,"안녕하세요");
		TextMessage msg4 = new TextMessage(1002,"안녕하세요");
		TextMessage msg5 = new TextMessage(1003,"안녕");
		
		//데이터 추가
		msgSet.add(msg1);
		msgSet.add(msg2);
		msgSet.add(msg3);
		msgSet.add(msg4);
		msgSet.add(msg5);
		
		System.out.println(msgSet.size());
		
		for(TextMessage msg: msgSet) {
			System.out.println("번호 : "+msg.getMsgNumber()+", 메시지 내용 : "+msg.getMsg());
		}
		System.out.println();
		
		//데이터 삭제
		msgSet.remove(msg1);
		for(TextMessage msg: msgSet) {
			System.out.println("번호 : "+msg.getMsgNumber()+", 메시지 내용 : "+msg.getMsg());
		}
	}
}
