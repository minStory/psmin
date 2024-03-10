package day31;

import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {
		//문자열 생성
		String str="kim:010-1234-1234";
		String delim=":";	//문자열을 나눌 기준
		StringTokenizer st=new StringTokenizer(str,delim);	//토큰 객체 생성 (문자열,delim);
		
		System.out.println("===첫번째 토큰 사용 전===");
		System.out.println(st.countTokens());	//토큰 사용 전 개수
		System.out.println(st.hasMoreTokens());	//토큰 사용 전 다음 토큰 유무 
		System.out.println(st.nextToken());	//토큰 사용 (출력)
		
		System.out.println("===두번째 토큰 사용 전===");
		System.out.println(st.countTokens());
		System.out.println(st.hasMoreTokens());
		System.out.println(st.nextToken());
		
		System.out.println("===세번째 토큰 사용 전===");
		System.out.println(st.countTokens());
		System.out.println(st.hasMoreTokens());
//		System.out.println(st.nextToken());	//다음 토큰이 없어서 에러
	}

}
