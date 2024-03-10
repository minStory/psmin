#include<stdio.h>
void main() {
	int w = 0, h = 0, b = 0;
	scanf_s("%d %d %d", &w, &h, &b);
	printf("%.2f MB", (float)(w * h * b) / 8 / 1024 / 1024);
}