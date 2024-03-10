#include<stdio.h>
void main() {
	int a = 10;
	int* ptr = &a;

	printf("값 : %d %d\n", a, *ptr);
	printf("주소값 : %d %d\n", &a, ptr);
}