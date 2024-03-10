//�߰� ����
//0 1 2 3 4 null null
//0 1 3 4 null null null
//size�� �� 1 ����
//int size() : ArrayList�� ����� ��ü�� ������ ��ȯ
//ArrayList ����
//1. �迭�� ������ �����ϰ� �����͸� �д� �� �ɸ��� �ð��� ª��.(���ٽð�)
//ArrayList ����
//1. ũ�⸦ ������ �� ����. -> ũ�⸦ �����ؾ��ϴ� ��� ���ο� �迭�� ���� �� �����͸� �����ؾ� �Ѵ�.
//-> ũ�� ������ ���ϱ� ���� ����� ū �迭�� �����ϸ� �޸𸮰� ����ȴ�.
//2. ��������� �������� �߰�, ������ �۾��ð��� ���� �ɸ���. -> ������ �߰� ���� �� �ٸ� �����͸� �Űܾ� �Ѵ�.
//-> �׷��� �������� ������ �߰�(���� �߰�), ����(������ ����)�� ������.

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
		
		Collections.sort(list1);	//�������� ����
		Collections.sort(list2);
		print(list1,list2);
		
		System.out.println("list1.containAll(list2) : "+list1.containsAll(list2));	//Ư�� ���� �����ϰ� �ִ��� ���� �Ǻ��ϴ� �޼���
		print(list1,list2);
		
		list2.add("B");	//[0,2,4,B]	add : �� �ڿ� �� �߰�
		list2.add("C");	//[0,2,4,B,C]
		list2.add(3,"A");	//[0,2,4,A,B,C]
		print(list1,list2);
		
		list2.set(3, "AA");	//set : list2�� 3���ε����� ���� AA�� ����
		System.out.println("list1.retainAll(list2) : "+list1.retainAll(list2));
		print(list1,list2);
		
		//list1���� list2�� ��ġ�� �κи� ����� ������ ����
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
