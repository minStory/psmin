//세준이는 기말고사를 망쳤다. 세준이는 점수를 조작해서 집에 가져가기로 했다. 일단 세준이는 자기 점수 중에 최댓값을 골랐다.
//이 값을 M이라고 한다. 그리고 나서 모든 점수를 점수/M*100으로 고쳤다.
//예를 들어, 세준이의 최고점이 70이고, 수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.
//세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에 시험 본 과목의 개수 N이 주어진다. 이 값은 1000보다 작거나 같다. 둘째 줄에 세준이의 현재 성적이 주어진다. 이 값은 100보다 작거나 같은 음이 아닌 정수이고, 적어도 하나의 값은 0보다 크다.
//
//3
//40 80 60   -> 75.0
//
//3
//10 20 30  ->66.666667
//
//4
//1 100 100 100 -> 75.25

package java230504;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 과목 개수 입력
		int arr[] = new int[n]; // 과목 점수 저장할 배열 생성
		int max = 0; // 최대값 저장할 변수 생성
		int sum = 0; // 합계를 저장할 변수 생성
		for (int i = 0; i < n; i++) { // 과목 개수만큼 반복
			arr[i] = sc.nextInt(); // 과목 점수 입력
			max = arr[i] > max ? arr[i] : max; // 입력 값이 max보다 크면 값을 max에 저장
			sum += arr[i]; // 모든 점수의 합계 계산
		}
		float aver = (float) sum / n;
		System.out.println(aver / max * 100); // 출력
	}
}
