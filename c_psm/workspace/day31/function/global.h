#include<stdio.h>

//��������(global variable)
int num1 = 10;
int num2 = 20;
static int num3 = 30;

void add() {
	//��������(local variable)
	int result = num1 + num2;
	printf("%d", result);
}

void sub() {
	printf("%d", num1 - num2);
} 