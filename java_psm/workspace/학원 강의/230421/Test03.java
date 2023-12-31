//바로 "45분 일찍 알람 설정하기"이다.
//이 방법은 단순하다. 원래 설정되어 있는 알람을 45분 앞서는 시간으로 바꾸는 것이다. 어차피 알람 소리를 들으면, 알람을 끄고 조금 더 잘 것이기 때문이다.
//이 방법을 사용하면, 매일 아침 더 잤다는 기분을 느낄 수 있고, 학교도 지각하지 않게 된다.
//현재 상근이가 설정한 알람 시각이 주어졌을 때, 창영이의 방법을 사용한다면, 이를 언제로 고쳐야 하는지 구하는 프로그램을 작성하시오.
//
//입력)
//첫째 줄에 두 정수 H와 M이 주어진다. (0 ≤ H ≤ 23, 0 ≤ M ≤ 59) 그리고 이것은 현재 상근이가 설정한 놓은 알람 시간 H시 M분을 의미한다.
//
//입력 시간은 24시간 표현을 사용한다. 24시간 표현에서 하루의 시작은 0:0(자정)이고, 끝은 23:59(다음날 자정 1분 전)이다. 시간을 나타낼 때, 불필요한 0은 사용하지 않는다.
//
//출력)
//첫째 줄에 상근이가 창영이의 방법을 사용할 때, 설정해야 하는 알람 시간을 출력한다. (입력과 같은 형태로 출력하면 된다.)
//
//예제
//10 10 9 25
//
//0 30  23 45
//23 40 22 55

package parkseongmin;
import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int h=sc.nextInt();
		int m=sc.nextInt();
		
		if(m-45>=0) {		//분-45가 0보다 클때
			System.out.printf("%d %d",h,m-45);
		}
		else {				//분-45가 0보다 작을 때
			if(h==0) {h=24;}	//h가 0일때 h를 24로 변경
			System.out.printf("%d %d",h-1,m+15);
		}
	}
}
