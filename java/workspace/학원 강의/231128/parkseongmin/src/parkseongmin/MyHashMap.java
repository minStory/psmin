package parkseongmin;

import java.util.HashMap;
import java.util.Map;

public class MyHashMap {

	public static void main(String[] args) {
		
		//Map ����
		Map<String,String> map = new HashMap<>();
		
		//������ ����
		map.put("Spring","��");
		map.put("Summer","����");
		map.put("Autumn","����");
		map.put("Winter","�ܿ�");
		System.out.println(map);
		
		//������ ����
		map.remove("Winter");
		System.out.println("Is Exist Key : "+map.containsKey("Winter"));
		System.out.println("Is Exist Value : "+map.containsValue("����"));
		
		System.out.println(map.get("Summer"));
	}

}
