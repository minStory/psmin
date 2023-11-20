#include<stdio.h>
#include<string.h>
void main() {
	int a = 0, b = 0;
	scanf_s("%d %d", &a, &b);

	printf("%d\n", a + b);
	printf("%d\n", a - b);
	printf("%d\n", a * b);
	printf("%d\n", a / b);
	printf("%d\n", a % b);
	printf("%.2f\n", (float)a / b);
}