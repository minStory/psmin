package day_0608;

import java.util.Scanner;
import java.util.Stack;

public class Test05 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Stack st=new Stack();
		int n=sc.nextInt();			//�Է��� Ƚ�� �Է�
		
		while(n>0) {				//n�� �Է� �ݺ�
			String str=sc.next();
			if(str.equals("push")) {	//push �Է� ��
				int i=sc.nextInt();		//�� �Է�
				st.push(i);				//���� ���ÿ� ����
			}
			else if(str.equals("pop")) {		//pop �Է� ��
				if(!st.empty()) {				//������ ������� �ʴٸ�
				System.out.println(st.pop());	//���� ������ ���
				}else {							//������ ����ִٸ�
					System.out.println(-1);		//-1 ���
				}
			}
			else if(str.equals("size")) {		//size �Է� ��
				System.out.println(st.size());	//���� ���� size ���
			}
			else if(str.equals("empty")) {		//empty �Է� ��
				if(st.empty()) {				//������ ����ִٸ�
					System.out.println(1);		//1 ���
				}else {							//������ ������� �ʴٸ�
					System.out.println(0);		//0 ���
				}
			}
			else if(str.equals("top")) {		//top �Է� ��
				System.out.println(st.peek());	//������ ���� ���
			}
			n--;
		}
	}

}
//������ �����ϴ� ������ ������ ����, �Է����� �־����� ����� ó���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//����� �� �ټ� �����̴�.
//
//push X: ���� X�� ���ÿ� �ִ� �����̴�.
//pop: ���ÿ��� ���� ���� �ִ� ������ ����, �� ���� ����Ѵ�. ���� ���ÿ� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
//size: ���ÿ� ����ִ� ������ ������ ����Ѵ�.
//empty: ������ ��������� 1, �ƴϸ� 0�� ����Ѵ�.
//top: ������ ���� ���� �ִ� ������ ����Ѵ�. ���� ���ÿ� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
//
//�Է�
//ù° �ٿ� �־����� ����� �� N (1 �� N �� 10,000)�� �־�����. ��° �ٺ��� N���� �ٿ��� ����� �ϳ��� �־�����.
//�־����� ������ 1���� ũ�ų� ����, 100,000���� �۰ų� ����. ������ �������� ���� ����� �־����� ���� ����.
//
//���
//����ؾ��ϴ� ����� �־��� ������, �� �ٿ� �ϳ��� ����Ѵ�.
//
//
//14
//push 1
//push 2
//top
//size
//empty
//pop
//pop
//pop
//size
//empty
//pop
//push 3
//empty
//top
//
///////////////
//2
//2
//0
//2
//1
//-1
//0
//1
//-1
//0
//3