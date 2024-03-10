package day38;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		Stack<String> s=new Stack<>();
		
		//1. push() : top�� ������ ����
		s.push("apple");
		s.push("banana");
		s.push("cherry");
		
		System.out.println(s);
		
		//2. pop()  top�� ������ ��ȯ �� ����
		System.out.println("pop : "+s.pop());
		System.out.println(s);
		
		//3. peek() : top�� ������ ����
		System.out.println("peek : "+s.peek());
		
		//4. search() : ����� ��ȣ Ȯ��(���� ���߿� ���� ���� 1��)
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
