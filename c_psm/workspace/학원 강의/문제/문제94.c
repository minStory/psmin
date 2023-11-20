#include<stdio.h>
void main() {
	int n = 0, temp = 0;
	int snum[10000] = { 0, };
	scanf_s("%d", &n);

	for (int i = 0; i < n; i++) {
		scanf_s("%d", &temp);
		snum[i] = temp;
	}
	for (int i = 0; i < n; i++) {
		printf("%d ", snum[n - 1 - i]);
	}

}
