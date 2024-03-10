#include<stdio.h>
void main() {
	int T, k, n = 0;
	int arr[15][15] = { 0, };
	
	scanf_s("%d", &T);

	for (int i = 1; i <= 15; i++) {
		arr[0][i-1] = i;
		arr[i-1][0] = 1;

	}
	for (int i = 1; i <= 15; i++) {
		for (int j = 1; j <= 15; j++) {
			arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
		}
	}
	
	for (int i = 0; i < T; i++) {
		scanf_s("%d %d", &k, &n);
		printf("%d\n", arr[k][n]);
	}

}