#include<stdio.h>
void main() {
	int n = 0, temp = 0;
	int snum[23] = { 0, };

	scanf_s("%d", &n);
	for (int i = 0; i < n; i++) {
		scanf_s("%d", &temp);
		snum[temp - 1]++;
	}
	for (int i = 0; i < 23; i++) {
		printf("%d ", snum[i]);
	}

}
