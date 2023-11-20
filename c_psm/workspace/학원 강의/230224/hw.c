#include<stdio.h>
void main() {

	int T = 0,num=0;

	printf("반복 횟수 : ");
	scanf_s("%d", &T);

	while (num < T) {
		int a = 0, b = 0;
		printf("정수 2번 입력 :");
		scanf_s("%d %d", &a, &b);
		printf("두 정수의 합은 %d입니다.\n", a + b);
		num++;
	}

	}