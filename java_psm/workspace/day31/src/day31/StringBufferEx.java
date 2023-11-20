package day31;

public class StringBufferEx {

	public static void main(String[] args) {
		String str="test";
		StringBuffer buffer=new StringBuffer("test");	//Buffer 객체 생성 필요
		
		str.replace('t','T');
		System.out.println(str);
		
		buffer.replace(1, 3, "ES");
		System.out.println(buffer);	//값 자체 변경
	}

}
