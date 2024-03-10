#include<stdio.h>

int fac(int num) { //재귀함수
	if (num ==1) {
		return 1;
	}
	else {
		return num * fac(num - 1);
	}
}

void main() {

	int n, result = 1;

	printf("정수 입력 : ");
	scanf_s("%d", &n);

	result = fac(n);
	printf("%d! =%d\n", n, result);
}