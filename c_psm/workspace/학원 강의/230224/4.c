#include<stdio.h>
void main() {
	int num = 0, n = 0;

	printf("숫자 입력 : ");
	scanf_s("%d", &n);


	for (int i = 1; i <= n; i++) {
		num += i;

	}

	printf("1부터 %d까지의 합은 %d입니다.",n, num);

}