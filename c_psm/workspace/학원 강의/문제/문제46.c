#include<stdio.h>
#include<string.h>
void main() {
	int a = 0, b = 0, c = 0;
	scanf_s("%d %d %d", &a, &b, &c);
	printf("%.d\n", a + b + c);
	printf("%.1f\n", (float)(a + b + c)/3);
}