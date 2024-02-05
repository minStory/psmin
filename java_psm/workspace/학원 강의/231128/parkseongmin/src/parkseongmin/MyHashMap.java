package parkseongmin;

import java.util.HashMap;
import java.util.Map;

public class MyHashMap {

	public static void main(String[] args) {
		
		//Map 선언
		Map<String,String> map = new HashMap<>();
		
		//데이터 삽입
		map.put("Spring","봄");
		map.put("Summer","여름");
		map.put("Autumn","가을");
		map.put("Winter","겨울");
		System.out.println(map);
		
		//데이터 삭제
		map.remove("Winter");
		System.out.println("Is Exist Key : "+map.containsKey("Winter"));
		System.out.println("Is Exist Value : "+map.containsValue("가을"));
		
		System.out.println(map.get("Summer"));
	}

}
