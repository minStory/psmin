package day31;

import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {
		//���ڿ� ����
		String str="kim:010-1234-1234";
		String delim=":";	//���ڿ��� ���� ����
		StringTokenizer st=new StringTokenizer(str,delim);	//��ū ��ü ���� (���ڿ�,delim);
		
		System.out.println("===ù��° ��ū ��� ��===");
		System.out.println(st.countTokens());	//��ū ��� �� ����
		System.out.println(st.hasMoreTokens());	//��ū ��� �� ���� ��ū ���� 
		System.out.println(st.nextToken());	//��ū ��� (���)
		
		System.out.println("===�ι�° ��ū ��� ��===");
		System.out.println(st.countTokens());
		System.out.println(st.hasMoreTokens());
		System.out.println(st.nextToken());
		
		System.out.println("===����° ��ū ��� ��===");
		System.out.println(st.countTokens());
		System.out.println(st.hasMoreTokens());
//		System.out.println(st.nextToken());	//���� ��ū�� ��� ����
	}

}
