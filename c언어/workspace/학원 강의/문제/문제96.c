#include<stdio.h>
void main() {
	int n = 0, x = 0, y = 0;
	int game[19][19] = { 0 };

	scanf_s("%d", &n);
	for (int i = 0; i < n; i++) {
		scanf_s("%d %d", &x, &y);
		game[x - 1][y - 1] = 1;
	}
	for (int i = 0; i < 19; i++) {
		for (int j = 0; j < 19; j++) {
			printf("%d ", game[i][j]);
		}
		printf("\n");
	}

}
