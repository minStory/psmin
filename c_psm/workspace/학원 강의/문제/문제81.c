#include<stdio.h>
#include<string.h>
void main() {
	int n = 0, m = 0;
	scanf_s("%d %d", &n, &m);
	for (int i = 1; i <= n; i++) {
		for (int j = 1; j <= m; j++){
		printf("%d %d\n", i, j);
		}
	}
}