package day39;

import java.util.HashMap;
import java.util.Scanner;

public class Map1 {

	public static void main(String[] args) {
		HashMap<String,String> hm=new HashMap<>();
		Scanner sc=new Scanner(System.in);
		
		//1. put(key, value) : key�� value �� �߰�
		hm.put("paper","����");
		hm.put("apple","���");
		hm.put("flower","��");
//		System.out.println(hm);
		
		System.out.print("�˰���� �ܾ �Է��ϼ��� >>> ");
		String voca=sc.nextLine();
		//2. containskey(key) : key�� hashmap�� �����ϸ� true
		if(hm.containsKey(voca)) {
			//3. get(key) : value �� ��ȯ
			System.out.println("�ش��ϴ� ���� '"+hm.get(voca)+"'�Դϴ�.");
		}
		else {
			System.out.println("�ش� �ܾ ���� ���� �����ͺ��̽��� �����ϴ�.");
		}
				
	}

}
 