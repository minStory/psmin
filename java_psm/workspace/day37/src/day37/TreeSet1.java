package day37;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		HashSet hs=new HashSet();	//중복 X, 순서(정렬) X
		hs.add("demon");
		hs.add("banana");
		hs.add("tomato");
		hs.add("apple");
		hs.add("cargo");
		
		hs.add("apple");
		
		TreeSet ts=new TreeSet();		//중복 X, 순서(정렬) O
		ts.add("demon");
		ts.add("banana");
		ts.add("tomato");
		ts.add("apple");
		ts.add("cargo");
		
		ts.add("apple");
		
		Iterator it=hs.iterator();
		System.out.println("<HashSet 출력>");
		while(it.hasNext()) {
			System.out.print(" "+it.next());
		}
		System.out.println();
		Iterator it2=ts.iterator();
		System.out.println("<TreeSet 출력>");
		while(it2.hasNext()) {
			System.out.print(" "+it2.next());
		}
		
		System.out.println();
		System.out.println("현재 HashSet의 크기 : "+hs.size());
		System.out.println("현재 TreeSet의 크기 : "+ts.size());
		
		
	}

}
