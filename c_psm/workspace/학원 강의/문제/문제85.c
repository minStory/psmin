#include<stdio.h>
void main() {
	int h = 0, b = 0, c = 0, s = 0;
	scanf_s("%d %d %d %d", &h, &b, &c, &s);
	printf("%.1f MB", (float)(h * b * c * s) / 8 / 1024 / 1024);
}