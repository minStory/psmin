#include<stdio.h>
void main() {
	int a = 0, b = 0, c = 0, day = 1;
	scanf_s("%d %d %d", &a, &b, &c);
	while (day % a || day % b || day % c) {
		day++;
	}
	printf("%d", day);
}