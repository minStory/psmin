#include<stdio.h>
#include<string.h>
void main() {
	int a = 0, b = 0, c = 0;
	scanf_s("%d %d %d", &a, &b, &c);
	printf("%d", a < b && a < c ? a : b < c ? b : c);
}