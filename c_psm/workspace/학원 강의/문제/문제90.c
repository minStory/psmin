#include<stdio.h>
void main() {
	int a = 0, r = 0, n = 0;
	scanf_s("%d %d %d", &a, &r, &n);
	int cnt = 1;
	while (cnt!=n) {
		a *= r;
		cnt++;
	}
	printf("%d", a);
}