#include<stdio.h>
int fac(int n) {
	if (n == 0) {
		return 1;
	}
	else {
		return n * fac(n - 1);
	}
}

void main() {
	int n = 0;
	scanf_s("%d", &n);
	printf("%d", fac(n));
}