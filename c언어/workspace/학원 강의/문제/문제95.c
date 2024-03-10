#include<stdio.h>
void main() {
	int n = 0, temp = 0, min = 23;
	int snum[10001] = { 0, };

	scanf_s("%d", &n);
	for (int i = 0; i < n; i++) {
		scanf_s("%d", &temp);
		snum[i] = temp;
		if (min > snum[i]) { min = snum[i]; }
	}

	printf("%d", min);

}
