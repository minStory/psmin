#include<stdio.h>
#include<string.h>
void main() {
	int a = 0;
	scanf_s("%x", &a);
	for (int i = 1; i < 16; i++) {
		printf("%X*%X=%X\n", a, i, a * i);
	}
}