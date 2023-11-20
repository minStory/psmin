#include<stdio.h>
#include<string.h>
void main() {
	int a = 0;
	scanf_s("%d", &a);

	a == 0 ? 0 : a > 0 ? printf("plus\n") : printf("minus\n");
	a == 0 ? 0 : a % 2 ? printf("odd\n") : printf("even\n");

}