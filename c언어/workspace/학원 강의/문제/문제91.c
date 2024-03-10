#include<stdio.h>
void main() {
	int a = 0, r = 0, d = 0, n = 0;
	scanf_s("%d %d %d %d", &a, &r, &d, &n);
	int cnt = 1;
	while (cnt != n) {
		a *= r;
		a += d;
		cnt++;
	}
	printf("%d", a);
}