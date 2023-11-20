//List Set Map
//List : 순서가 있는 데이터의 집합, 데이터의 중복을 허용한다.
//Set : 순서를 유지하지 않은 데이터의 집합, 데이터 중복을 허용하지 않는다.
//Map : 키와 값을 쌍으로 이루어진 데이터 조합, 순서 유지X, 키 중복X, 값 중복O

//Object get(int index) : 지정된 위치에 있는 객체를 반환한다.
//int lastIndexOf(Object o) : 지정된 객체의 위치를 반환한다.(List의 마지막 요소부터 역방향으로 찾는다.)
//Object set(int index, Object element) : 지정된 위치(index)에 객체를 저장한다.

package day_0608;

import java.util.*;

public class Test01 {

	public static void main(String[] args) {
		ArrayList list1=new ArrayList(10);
		 list1.add("A");
		 list1.add("C");
		 list1.add("E");
		 list1.add("D");
		 System.out.print("초기상태 : ");
		 System.err.println(list1);
		 
		 System.out.print("인덱스 1 위치에 B 추가 : ");
		 list1.add(1,"B");
		 System.out.println(list1);
		 
		 System.out.println("인덱스 2 위치의 값 삭제 : ");
		 list1.remove(2);
		 System.out.println(list1);
		 
		 System.out.println("인덱스 2번 위치의 값 반환 : "+list1.get(2));
		 
	}

}
