#include<stdio.h>
void main() {
	int a = 0, d = 0, n = 0;
	scanf_s("%d %d %d", &a, &d, &n);
	int cnt = 1;
	while (cnt!=n) {
		a += d;
		cnt++;
	}
	printf("%d", a);
}