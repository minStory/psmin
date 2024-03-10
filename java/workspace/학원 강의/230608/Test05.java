package day_0608;

import java.util.Scanner;
import java.util.Stack;

public class Test05 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Stack st=new Stack();
		int n=sc.nextInt();			//입력할 횟수 입력
		
		while(n>0) {				//n번 입력 반복
			String str=sc.next();
			if(str.equals("push")) {	//push 입력 시
				int i=sc.nextInt();		//값 입력
				st.push(i);				//값을 스택에 저장
			}
			else if(str.equals("pop")) {		//pop 입력 시
				if(!st.empty()) {				//스택이 비어있지 않다면
				System.out.println(st.pop());	//정수 꺼내어 출력
				}else {							//스택이 비어있다면
					System.out.println(-1);		//-1 출력
				}
			}
			else if(str.equals("size")) {		//size 입력 시
				System.out.println(st.size());	//현재 스택 size 출력
			}
			else if(str.equals("empty")) {		//empty 입력 시
				if(st.empty()) {				//스택이 비어있다면
					System.out.println(1);		//1 출력
				}else {							//스택이 비어있지 않다면
					System.out.println(0);		//0 출력
				}
			}
			else if(str.equals("top")) {		//top 입력 시
				System.out.println(st.peek());	//맨위의 정수 출력
			}
			n--;
		}
	}

}
//정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
//
//명령은 총 다섯 가지이다.
//
//push X: 정수 X를 스택에 넣는 연산이다.
//pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//size: 스택에 들어있는 정수의 개수를 출력한다.
//empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
//top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//
//입력
//첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다. 둘째 줄부터 N개의 줄에는 명령이 하나씩 주어진다.
//주어지는 정수는 1보다 크거나 같고, 100,000보다 작거나 같다. 문제에 나와있지 않은 명령이 주어지는 경우는 없다.
//
//출력
//출력해야하는 명령이 주어질 때마다, 한 줄에 하나씩 출력한다.
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