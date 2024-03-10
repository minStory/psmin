#include<stdio.h>
#include<string.h>
void main() {
	int y = 0, m = 0, d = 0;
	scanf_s("%d.%d.%d", &y, &m, &d);

	printf("%02d-%02d-%04d", d, m, y);
}