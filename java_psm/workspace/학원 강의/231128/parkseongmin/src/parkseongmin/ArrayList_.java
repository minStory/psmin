package parkseongmin;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_ {

	public static void main(String[] args) {
		//ArrayList
		
		//add : �߰�, set : ����, remove : ����
		
		//����Ʈ ����
		List<String> list = new ArrayList<>();
		
		list.add("����");
		list.add("�ٳ���");
		list.add("����");
		System.out.println("����Ʈ ����1 : "+list);
		
		list.add(2,"����");
		System.out.println("����Ʈ ����2 : "+list);
		
		list.remove(0);
		list.remove("�ٳ���");
		System.out.println("����Ʈ ����3 : "+list);
		
		//����Ʈ2 ����
		List<String> list2 = new ArrayList<>();
		
		list2.add("����");
		list2.add("�ٳ���");
		list2.add("����");
		System.out.println("����Ʈ2 ����1 : "+list2);
		
		list2.set(1,"������");
		list2.set(2,"���ø���");
		System.out.println("����Ʈ2 ����2 : "+list2);
	}

}
