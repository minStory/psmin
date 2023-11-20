package day38;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		
		//����(rear)�� ���ͼ� �Ӹ�(front)�� ������.
		Queue<String> q=new LinkedList<>();
		//1. add(e)		//rear(����) ��ġ�� e ���� (==offer)
		q.add("apple");
		q.add("banana");
		q.add("cherry");
		q.add("tomato");		
		
		System.err.println(q);
		//2. E element		//front(�Ӹ�)�� ��ġ�� ������ ��ȯ (==peek)
		System.out.println("element : "+q.element());
		System.out.println(q);
		
		//3. remove		//front(�Ӹ�)�� ��ġ�� �����͸� ��ȯ �� ���� (==poll)
		System.out.println("remove : "+q.remove());
		System.out.println(q);
		
		//4. offer		//rear(����)��ġ�� ������ ���� (==add)
		q.offer("peach");
		System.out.println("offer : \n"+q);
		
		//5. peek		//front ��ġ�� �ִ� �������� �� ��ȯ (==element)
		System.out.println("peek : "+q.peek());
		System.out.println(q);
		
		//6. poll		//front�� ��ġ�� ������ ��ȯ �� ���� (==remove)
		System.out.println("poll : "+q.poll());
		System.out.println(q);
		
	}

}
