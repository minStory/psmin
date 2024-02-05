package parkseongmin;

public class StringMethod {
	public static void main(String[] args) {
		//String 클래스(java.lang) : charAt() 메서드
		//문자열을 하나의 단어 단위로 출력
		String word = "1I2LOVE6YOU";
		//문자열에서 숫자를 찾아 제거하고 문자만 출력
		String text = "";
		//length() : 문자열 길이를 반환, 해당 문자열의 길이를 반환하는 메서드를 통해서 word길이:11
		
		//아스키코드를 이용한 문자/숫자 판별
		for(int i=0; i<word.length(); i++) {
			if(!((int)word.charAt(i)>=65 && (int)word.charAt(i)<=122)) {
				System.out.print("");
			}else{
				System.out.print(word.charAt(i));
			}
		}
		System.out.println();
		//Character.isDigit() : 문자/숫자 판별 함수
		for(int i=0; i<word.length(); i++) {
			if(!Character.isDigit(word.charAt(i))) {
				System.out.print(word.charAt(i));
			}
		}
		System.out.println();
		
		//indexOf() 메서드 : 문자열에 포함한 단어 또는 문자열의 위치를 검색했을 때
		//위치의 인덱스 값을 반환
		String strIndex = "HelloWorld_MyWorld";
		
		//World 처음 인덱스 번호가 어디서 시작되는지를 알고싶을 때
		System.out.println(strIndex.indexOf("World"));
		System.out.println(strIndex.lastIndexOf("World"));
		
		//replaceAll(변경 대상, 변경할 단어) : 변경대상을 변경할 단어로 변경한다.
		String str = "자바 프로그래밍은 어렵지만 자바를 배울수록 재미있어요.";
		System.out.println(str.replaceAll("자바","java"));
		String newStr = str.replaceAll("자바","java");
		System.out.println(newStr);
		
		//substring() : 원하는 위치의 문자열을 잘라서 사용하는 메서드
		String subStr = "12345678";
		System.out.println(subStr.substring(5,8));
		String subStr_ = subStr.substring(0,3);
		System.out.println(subStr_);
		
		//split()
		String splitStr = "안녕-하세요";
		String[] arr = splitStr.split("-");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		//StringBuffer/StringBuilder 모두 String의 메서드 사용 가능
		
		//StringBuffer
		StringBuffer strBuffer = new StringBuffer("abc");
		System.out.println(strBuffer);
		StringBuffer strBuffer2 = strBuffer.append("zzz");
		System.out.println(strBuffer);
		strBuffer.insert(0,"버퍼에 추가");
		System.out.println(strBuffer);
		strBuffer.reverse();
		System.out.println(strBuffer);
		
		//StringBuilder
		StringBuilder strBuilder = new StringBuilder("ABC");
		System.out.println(strBuilder);
		StringBuilder strBuilder2 = strBuilder.append("ZZZ");
		System.out.println(strBuilder2);
		
		
	}
}














