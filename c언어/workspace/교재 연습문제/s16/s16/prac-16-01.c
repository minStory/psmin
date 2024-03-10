#include<stdio.h>
void main() {
	int a = 5, b = 3;
	getDiffByValue(a, b);
	callDiffByRef(&a, &b);
	printf("%d %d", a, b);
}
int getDiffByValue(int a, int b) {
	printf("%d\n", a - b);
}
int callDiffByRef(int* a, int* b) {
	if (*b > *a) {
		int temp = 0;
		temp = *a;
		*a = b;
		*b = temp;
	}
	printf("a´Â %d, b´Â %d\n", *a, *b);
}