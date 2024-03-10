package day31;

public class StringEx1 {

	public static void main(String[] args) {
		String str="hello";
		//concat
		//���� ���ڿ��� ���ڿ� �ٿ��� ��ȯ
		System.out.println(str.concat(" world!"));
		System.out.println(str);	//str �� ��ü�� ������ ����
		
		//substring()
		System.out.println(str.substring(2, 4));
		//substring(������ġ,����ġ) : ������ġ~����ġ������ ��ȯ
		System.err.println(str.substring(2));
		//substring(������ġ) : ������ġ~���ڿ������� ��ȯ
		
		//length()
		System.out.println(str.length());
		
		//toUppercase, toLowercase
		System.out.println(str.toUpperCase());	//�빮�ڷ� ��ȯ
		System.out.println("Test".toLowerCase());	//�ҹ��ڷ� ��ȯ
		
		//charAt(�ε���), indexOf(���ڿ�, equals(���ڿ�)
		System.out.println(str.charAt(1));	//�ش� �ε����� ���� ��ȯ
		System.out.println("hello world".indexOf("WORLD"));	//����or���ڿ� �˻� ��� (-1 : ��ã��)
		System.out.println(str.equals("hello"));	//���ڿ� ��
		
		//trim(), replace, replaceAll
		System.out.println(" test ".trim());	//���ڿ� ��,�� ���� ����
		System.out.println("hello world".replace('l','L'));	//����or���ڿ� ��ü
		System.out.println("hello world".replaceAll("hello", "bye"));	//��ü ����or���ڿ� ��ü
	}

}
