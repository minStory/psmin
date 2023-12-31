//첫째 줄에 시험 본 과목의 개수 N이 주어진다.이 값은 1000보다 작거나 같다.
//둘째 줄에 세준이의 현재 성적이 주어진다.
//이 값은 100보다 작거나 같은 음이 아닌 정수이고, 적어도 하나의 값은 0보다 크다.
//
//입력 받은 값중에 최대값 M 고르고
//나머지 모든 점수를 / M * 100 으로 고친다.
//
//3
//40 80 60		75.0
//
//3
//10 20 30		6.666667
//
//2
//3 10 		65.0

#include<stdio.h>
void main() {
	double N = 0, max = 0, sum = 0; //나눗셈 나머지 실수형
	int* M;
	M = (int*)malloc(sizeof(int) * N); //동적할당

	scanf_s("%lf", &N); // 과목 개수 입력

	for (int i = 0; i < N; i++) { //과목 개수 만큼 점수 입력
		scanf_s("%d", &M[i]);
	}
	for (int i = 0; i < N; i++) { //최대값 구하기
		if (max < M[i]) { max = M[i]; }
	}
	for (int i = 0; i < N; i++) { //점수 합계 구하기
		sum += M[i];
	}
	printf("%.2lf", (sum / N) / max * 100); // 구할 값을 식으로 입력

}