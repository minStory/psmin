#include<stdio.h>
void main() {

	int decimal = 0, choice = 1;

	printf("10진수 정수 입력 : ");
	scanf_s("%d", &decimal);

	printf("몇 진수로 출력할까요? 8진수는 1 입력, 16진수는 2 입력 : ");
	scanf_s("%d", &choice);

	choice==1 ? printf("결과 : %o", decimal) : printf("결과 : %x", decimal);




}