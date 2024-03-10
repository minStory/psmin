//추가 삭제
//0 1 2 3 4 null null
//0 1 3 4 null null null
//size의 값 1 감소
//int size() : ArrayList에 저장된 객체의 개수를 반환
//ArrayList 장점
//1. 배열은 구조가 간단하고 데이터를 읽는 데 걸리는 시간이 짧다.(접근시간)
//ArrayList 단점
//1. 크기를 변경할 수 없다. -> 크기를 변경해야하는 경우 새로운 배열을 생성 후 데이터를 복사해야 한다.
//-> 크기 변경을 피하기 위해 충분히 큰 배열을 생성하면 메모리가 낭비된다.
//2. 비순차적인 데이터의 추가, 삭제에 작업시간이 많이 걸린다. -> 데이터 추가 삭제 시 다른 데이터를 옮겨야 한다.
//-> 그러나 순차적인 데이터 추가(끝에 추가), 삭제(끝부터 삭제)는 빠르다.

package day_0608;

import java.util.ArrayList;
import java.util.Collections;

public class Test02 {

	public static void main(String[] args) {
		ArrayList list1=new ArrayList(10);
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(3));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(3));
		
		ArrayList list2=new ArrayList(list1.subList(1, 4));
		print(list1,list2);
		
		Collections.sort(list1);	//오름차순 정렬
		Collections.sort(list2);
		print(list1,list2);
		
		System.out.println("list1.containAll(list2) : "+list1.containsAll(list2));	//특정 값을 포함하고 있는지 여부 판별하는 메서드
		print(list1,list2);
		
		list2.add("B");	//[0,2,4,B]	add : 맨 뒤에 값 추가
		list2.add("C");	//[0,2,4,B,C]
		list2.add(3,"A");	//[0,2,4,A,B,C]
		print(list1,list2);
		
		list2.set(3, "AA");	//set : list2의 3번인덱스의 값을 AA로 변경
		System.out.println("list1.retainAll(list2) : "+list1.retainAll(list2));
		print(list1,list2);
		
		//list1에서 list2와 겹치는 부분만 남기고 나머지 삭제
		for(int i=list2.size()-1 ; i>=0 ; i--) {
			if(list1.contains(list2.get(i))) {
				list2.remove(i);
			}
		}
		print(list1,list2);
	}
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1 : "+list1);
		System.out.println("list2 : "+list2);
		System.out.println();
	}
}
