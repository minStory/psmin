package day38;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		Stack<String> s=new Stack<>();
		
		//1. push() : top에 데이터 삽입
		s.push("apple");
		s.push("banana");
		s.push("cherry");
		
		System.out.println(s);
		
		//2. pop()  top의 데이터 반환 후 삭제
		System.out.println("pop : "+s.pop());
		System.out.println(s);
		
		//3. peek() : top의 데이터 보기
		System.out.println("peek : "+s.peek());
		
		//4. search() : 요소의 번호 확인(제일 나중에 들어온 것이 1번)
		System.out.println(s.search("apple"));
		System.out.println(s.search("banana"));
		
		s.clear();
		System.out.println(s);
		s.add("tomato");
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s);
		
	}

}
