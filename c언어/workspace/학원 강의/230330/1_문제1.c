#include<stdio.h>
void main() {
	int a = 10;
	int* ptr = &a;

	printf("�� : %d %d\n", a, *ptr);
	printf("�ּҰ� : %d %d\n", &a, ptr);
}