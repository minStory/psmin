package day37;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList list1=new ArrayList(10);		//크기 지정 선택 (안해도 됨)
		list1.add("A");
		list1.add("C");
		list1.add("E");
		list1.add("D");
		System.out.print("초기 상태 : ");
		System.out.println(list1);
		
		System.out.print("인덱스 1위치에 B 추가 : ");
		list1.add(1,"B");
		System.out.println(list1);
		
		System.out.print("인덱스 2취이의 값 삭제 : ");
		list1.remove(2);
		System.out.println(list1);
		
		System.out.print("인덱스 2위치의 값 반환 : "+list1.get(2));
		System.out.println();
		
//		for(int i=0 ; i<list1.size(); i++) {
//			System.out.println(list1.get(i));
//		}
		
	}

}
