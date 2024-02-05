package parkseongmin;

public class TextMessage {
	//메시지를 식별하는 번호
	private int msgNumber;	//번호
	private String msg;		//메시지 내용
	
	public TextMessage(int msgNumber, String msg) {
		this.msgNumber = msgNumber;
		this.msg = msg;
	}
	
	//메소드를 활용해서 private 접근제한자를 꺼내는 메서드
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
