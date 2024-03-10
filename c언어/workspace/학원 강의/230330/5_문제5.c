//포인터 변수 두 개를 이용하여 두 수를 입력 받고 사칙 연산을 수행하는 프로그램 만들기

#include<stdio.h>
#include<stdlib.h>
void main() {
	int* a = 0;
	int* b = 0;
	a = (int*)calloc(10, sizeof(int));
	b = (int*)calloc(10, sizeof(int));
	scanf_s("%d %d", a, b);

	printf("%d + %d = %d\n", *a,*b,*a + *b);
	printf("%d - %d = %d\n", *a,*b,*a - *b);
	printf("%d * %d = %d\n", *a,*b,*a * *b);
	printf("%d / %d = %d\n", *a,*b,*a / *b);
	printf("%d %% %d = %d\n", *a,*b,*a % *b);
}