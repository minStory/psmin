//List Set Map
//List : ������ �ִ� �������� ����, �������� �ߺ��� ����Ѵ�.
//Set : ������ �������� ���� �������� ����, ������ �ߺ��� ������� �ʴ´�.
//Map : Ű�� ���� ������ �̷���� ������ ����, ���� ����X, Ű �ߺ�X, �� �ߺ�O

//Object get(int index) : ������ ��ġ�� �ִ� ��ü�� ��ȯ�Ѵ�.
//int lastIndexOf(Object o) : ������ ��ü�� ��ġ�� ��ȯ�Ѵ�.(List�� ������ ��Һ��� ���������� ã�´�.)
//Object set(int index, Object element) : ������ ��ġ(index)�� ��ü�� �����Ѵ�.

package day_0608;

import java.util.*;

public class Test01 {

	public static void main(String[] args) {
		ArrayList list1=new ArrayList(10);
		 list1.add("A");
		 list1.add("C");
		 list1.add("E");
		 list1.add("D");
		 System.out.print("�ʱ���� : ");
		 System.err.println(list1);
		 
		 System.out.print("�ε��� 1 ��ġ�� B �߰� : ");
		 list1.add(1,"B");
		 System.out.println(list1);
		 
		 System.out.println("�ε��� 2 ��ġ�� �� ���� : ");
		 list1.remove(2);
		 System.out.println(list1);
		 
		 System.out.println("�ε��� 2�� ��ġ�� �� ��ȯ : "+list1.get(2));
		 
	}

}
