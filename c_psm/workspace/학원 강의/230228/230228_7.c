#include<stdio.h>

// ���� ���� number
int number = 0;

void printNumber(void) {
	printf("���� ���� number�� %d�� �����ϰ� �ִ�!\n", number);
}

void main()
{
	//���� ���� number
	int number = 3;
	printf("���� ���� number�� %d�� �����ϰ� �ִ�!\n", number);
	printNumber();

	return 0;

}