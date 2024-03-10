package parkseongmin;

import java.util.HashSet;
import java.util.Set;

public class HashSet_ {

	public static void main(String[] args) {
		
		Set<TextMessage> msgSet = new HashSet<>();
		
		//TextMessage ���� -> �ν��Ͻ� -> Ŭ������ ������ HashSet(�ߺ��� üũ�Ѵ�)
		TextMessage msg1 = new TextMessage(1001,"�ȳ��ϼ���");
		TextMessage msg2 = new TextMessage(1001,"�ȳ��ϼ���");
		TextMessage msg3 = new TextMessage(1001,"�ȳ��ϼ���");
		TextMessage msg4 = new TextMessage(1002,"�ȳ��ϼ���");
		TextMessage msg5 = new TextMessage(1003,"�ȳ�");
		
		//������ �߰�
		msgSet.add(msg1);
		msgSet.add(msg2);
		msgSet.add(msg3);
		msgSet.add(msg4);
		msgSet.add(msg5);
		
		System.out.println(msgSet.size());
		
		for(TextMessage msg: msgSet) {
			System.out.println("��ȣ : "+msg.getMsgNumber()+", �޽��� ���� : "+msg.getMsg());
		}
		System.out.println();
		
		//������ ����
		msgSet.remove(msg1);
		for(TextMessage msg: msgSet) {
			System.out.println("��ȣ : "+msg.getMsgNumber()+", �޽��� ���� : "+msg.getMsg());
		}
	}
}
