#include<stdio.h>

void main() { // ������,�ǿ����� �޾Ƽ� ����ϱ�

	int num1 = 0, num2 = 0;
	char oper = ' ';

	printf("�ǿ�����1 : ");
	scanf_s("%d", &num1);

	printf("������ : ");
	scanf_s(" %c", &oper);

	printf("�ǿ�����2 : ");
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

