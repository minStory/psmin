package day31;

public class StringEx1 {

	public static void main(String[] args) {
		String str="hello";
		//concat
		//기존 문자열에 문자열 붙여서 반환
		System.out.println(str.concat(" world!"));
		System.out.println(str);	//str 값 자체는 변하지 않음
		
		//substring()
		System.out.println(str.substring(2, 4));
		//substring(시작위치,끝위치) : 시작위치~끝위치전까지 반환
		System.err.println(str.substring(2));
		//substring(시작위치) : 시작위치~문자열끝까지 반환
		
		//length()
		System.out.println(str.length());
		
		//toUppercase, toLowercase
		System.out.println(str.toUpperCase());	//대문자로 변환
		System.out.println("Test".toLowerCase());	//소문자로 변환
		
		//charAt(인덱스), indexOf(문자열, equals(문자열)
		System.out.println(str.charAt(1));	//해당 인덱스의 문자 반환
		System.out.println("hello world".indexOf("WORLD"));	//문자or문자열 검색 기능 (-1 : 못찾음)
		System.out.println(str.equals("hello"));	//문자열 비교
		
		//trim(), replace, replaceAll
		System.out.println(" test ".trim());	//문자열 앞,뒤 공백 제거
		System.out.println("hello world".replace('l','L'));	//문자or문자열 대체
		System.out.println("hello world".replaceAll("hello", "bye"));	//전체 문자or문자열 대체
	}

}
