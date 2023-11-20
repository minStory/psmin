#include<stdio.h>
void main() {
	int n = 0;
	scanf_s("%d", &n);
	for (int i = 1; i <= n; i++) {
		i % 3 ? printf("%d ", i) : 0;
	}
}