#include<stdio.h>
void main() {
	int n = 0;
	scanf_s("%d", &n);
	int sum = 0;
	for (int i = 1; sum < n; i++) {
		sum += i;
	}
	printf("%d", sum);
}