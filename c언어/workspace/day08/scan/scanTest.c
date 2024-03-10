#include<stdio.h>
void main() {
	//정수 2개 입력받고 더하기
	int num1 = 0, num2 = 0, result = 0;

	printf("첫번째 정수 : ");
	scanf_s("%d", &num1);

	printf("두번째 정수 : ");
	scanf_s("%d", &num2);

	//printf("%d %d", num1, num2);
	result = num1 + num2;
	printf("%d+%d=%d", num1, num2, result);


}