#include<stdio.h>
void main() {

	int num1 = 0, num2 = 0;
	
	printf("NUM1 : ");
	scanf_s("%d", &num1);
	printf("NUM2 : ");
	scanf_s("%d", &num2);

	printf("%d\n", num1 && num2);
	printf("%d\n", num1 || 3);
	printf("%d\n", num1 & 3);
	printf("%d\n", num1 | 3);



}