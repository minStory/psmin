//LinkedList 구조
//class Node{
//		Node next;	//다음 주소값
//		Object obj;	//데이터
//}
//이중연결리스트
//이전 주소값 포함하여 양방향 이동 가능
//이중원형연결리스트
//시작과 끝을 잇는다.

package day_0608;

import java.util.ArrayList;
import java.util.LinkedList;

public class Test03 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		LinkedList ll=new LinkedList();
		long start=System.currentTimeMillis();
		
		for(int i=0 ; i<100000 ; i++) {
			al.add(0,String.valueOf(i));
		}
		
		long end=System.currentTimeMillis();
		System.out.println("ArrayList 작업시간 : "+(end-start));
		start=System.currentTimeMillis();
		
		for(int i=0 ; i<100000 ; i++) {
			ll.add(0,String.valueOf(i));
		}
		end=System.currentTimeMillis();
		System.out.println("LinkedList 작업시간 : "+(end-start));
	}
}
