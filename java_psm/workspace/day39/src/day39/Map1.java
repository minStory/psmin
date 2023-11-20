package day39;

import java.util.HashMap;
import java.util.Scanner;

public class Map1 {

	public static void main(String[] args) {
		HashMap<String,String> hm=new HashMap<>();
		Scanner sc=new Scanner(System.in);
		
		//1. put(key, value) : key와 value 값 추가
		hm.put("paper","종이");
		hm.put("apple","사과");
		hm.put("flower","꽃");
//		System.out.println(hm);
		
		System.out.print("알고싶은 단어를 입력하세요 >>> ");
		String voca=sc.nextLine();
		//2. containskey(key) : key가 hashmap에 존재하면 true
		if(hm.containsKey(voca)) {
			//3. get(key) : value 값 반환
			System.out.println("해당하는 뜻은 '"+hm.get(voca)+"'입니다.");
		}
		else {
			System.out.println("해당 단어에 대한 뜻이 데이터베이스에 없습니다.");
		}
				
	}

}
 