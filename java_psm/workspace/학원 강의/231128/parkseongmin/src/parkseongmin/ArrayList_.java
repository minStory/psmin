package parkseongmin;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_ {

	public static void main(String[] args) {
		//ArrayList
		
		//add : 추가, set : 변경, remove : 삭제
		
		//리스트 선언
		List<String> list = new ArrayList<>();
		
		list.add("딸기");
		list.add("바나나");
		list.add("망고");
		System.out.println("리스트 내용1 : "+list);
		
		list.add(2,"수박");
		System.out.println("리스트 내용2 : "+list);
		
		list.remove(0);
		list.remove("바나나");
		System.out.println("리스트 내용3 : "+list);
		
		//리스트2 선언
		List<String> list2 = new ArrayList<>();
		
		list2.add("딸기");
		list2.add("바나나");
		list2.add("망고");
		System.out.println("리스트2 내용1 : "+list2);
		
		list2.set(1,"복숭아");
		list2.set(2,"애플망고");
		System.out.println("리스트2 내용2 : "+list2);
	}

}
