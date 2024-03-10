#include<stdio.h>
#include<string.h>
void main() {
	int a = 0, b = 0, c = 0;
	scanf_s("%d %d %d", &a, &b, &c);

	a % 2 ? printf("odd\n") : printf("even\n");
	b % 2 ? printf("odd\n") : printf("even\n");
	c % 2 ? printf("odd\n") : printf("even\n");

}