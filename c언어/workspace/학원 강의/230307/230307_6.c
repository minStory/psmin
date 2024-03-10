//과제
//
//정수N개로 이루어진 수열 A와 정수 X가 주어진다.이대, A에서 X보다 작은 수를 모두 출력하는 프로그램
//
//첫째 줄에 N과 X가 주어진다. (1 <= N, X <= 10, 000)
//
//둘째 줄에 수열 A를 이루는 정수 N개가 주어진다.주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.
//
//입력 예제						출력 예제
//10 5							1 4 2 3
//1 10 4 9 2 3 8 5 7 6

#include<stdio.h>
void main() {

	// 과제 동적할당 응용

	int N = 0, X = 0;
	int* A;
	A = (int*)malloc(sizeof(int) * N);

	scanf_s("%d %d", &N,&X);

	for (int i=0; i < N; i++) {
		scanf_s("%d", &A[i]);
		if (A[i] < X) { printf("%d ", A[i]); }
	}


	//int N = 0, X = 0;
	//int A[10000] = { 0, };

	//printf("수열의 개수 N, 정수 X 차례로 입력 : ");
	//scanf_s("%d %d", &N, &X);

	//for (int i = 0; i < N; i++) {
	//	scanf_s("%d", &A[i]);
	//	if (A[i] < X) { printf("%d ", A[i]); }
	//}
}

