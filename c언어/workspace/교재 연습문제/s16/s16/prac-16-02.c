#include<stdio.h>
void main() {
	int num1 = 5, num2 = 8, num3 = 10;

	printf("�Լ� ȣ�� �� num1 num2 num3 : %d %d %d\n", num1, num2, num3);
	swapNumber(&num1, &num2, &num3);
	printf("�Լ� ȣ�� �� num1 num2 num3 : %d %d %d\n", num1, num2, num3);

}
int swapNumber(int* num1, int* num2, int* num3) {
	int temp = 0;
	temp = *num1;
	*num1 = *num3;
	*num3 = *num2;
	*num2 = temp;
	printf("�Լ� ȣ�� �� num1 num2 num3 : %d %d %d\n", *num1, *num2, *num3);

}