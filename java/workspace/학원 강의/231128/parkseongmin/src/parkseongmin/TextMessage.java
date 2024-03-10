package parkseongmin;

public class TextMessage {
	//�޽����� �ĺ��ϴ� ��ȣ
	private int msgNumber;	//��ȣ
	private String msg;		//�޽��� ����
	
	public TextMessage(int msgNumber, String msg) {
		this.msgNumber = msgNumber;
		this.msg = msg;
	}
	
	//�޼ҵ带 Ȱ���ؼ� private ���������ڸ� ������ �޼���
	public int getMsgNumber() {
		return msgNumber;
	}
	
	public String getMsg() {
		return msg;
	}
	
	public int hashCode() {
		return msgNumber;
	}
	
	//@Override
	public boolean equals(Object obj) {
		if(obj instanceof TextMessage) {
			TextMessage compare = (TextMessage)obj;
			if(this.msg.equals(compare.getMsg())){
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
	
}
