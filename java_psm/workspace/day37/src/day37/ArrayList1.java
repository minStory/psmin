package day37;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList list1=new ArrayList(10);		//ũ�� ���� ���� (���ص� ��)
		list1.add("A");
		list1.add("C");
		list1.add("E");
		list1.add("D");
		System.out.print("�ʱ� ���� : ");
		System.out.println(list1);
		
		System.out.print("�ε��� 1��ġ�� B �߰� : ");
		list1.add(1,"B");
		System.out.println(list1);
		
		System.out.print("�ε��� 2������ �� ���� : ");
		list1.remove(2);
		System.out.println(list1);
		
		System.out.print("�ε��� 2��ġ�� �� ��ȯ : "+list1.get(2));
		System.out.println();
		
//		for(int i=0 ; i<list1.size(); i++) {
//			System.out.println(list1.get(i));
//		}
		
	}

}
