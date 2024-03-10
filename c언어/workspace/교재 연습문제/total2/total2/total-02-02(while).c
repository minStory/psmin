#include<stdio.h>
void main() {

	int a = 0, b = 0;

	scanf_s("%d %d", &a, &b);

	while (a<=b) {
		int n = 1;
		while (n<10) {
		printf("%d * %d = %2d ", a, n, a * n);
			n++;

			}
		printf("\n");
		a++;

	}
}