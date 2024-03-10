#include<stdio.h>

void main() { // 연산자,피연산자 받아서 출력하기

	int num1 = 0, num2 = 0;
	char oper = ' ';

	printf("피연산자1 : ");
	scanf_s("%d", &num1);

	printf("연산자 : ");
	scanf_s(" %c", &oper);

	printf("피연산자2 : ");
	scanf_s("%d", &num2);

	switch (oper) {
	case '+':
		printf("%d %c %d = %d", num1,oper,num2,num1+num2 );
			break;
	case '-':
		printf("%d %c %d = %d", num1, oper, num2, num1 - num2);
			break;
	case '*':
		printf("%d %c %d = %d", num1, oper, num2, num1 * num2);
			break;
	case '/':
		printf("%d %c %d = %d", num1, oper, num2, num1 / num2);
			break;
	case '%':
		printf("%d %c %d = %d", num1, oper, num2, num1 % num2);
			break;
	default:
		break;
	}

