package day38;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		
		//꼬리(rear)로 들어와서 머리(front)로 나간다.
		Queue<String> q=new LinkedList<>();
		//1. add(e)		//rear(꼬리) 위치에 e 삽입 (==offer)
		q.add("apple");
		q.add("banana");
		q.add("cherry");
		q.add("tomato");		
		
		System.err.println(q);
		//2. E element		//front(머리)에 위치한 데이터 반환 (==peek)
		System.out.println("element : "+q.element());
		System.out.println(q);
		
		//3. remove		//front(머리)에 위치한 데이터를 반환 후 삭제 (==poll)
		System.out.println("remove : "+q.remove());
		System.out.println(q);
		
		//4. offer		//rear(꼬리)위치에 데이터 삽입 (==add)
		q.offer("peach");
		System.out.println("offer : \n"+q);
		
		//5. peek		//front 위치에 있는 데이터의 값 반환 (==element)
		System.out.println("peek : "+q.peek());
		System.out.println(q);
		
		//6. poll		//front에 위치한 데이터 반환 후 삭제 (==remove)
		System.out.println("poll : "+q.poll());
		System.out.println(q);
		
	}

}
