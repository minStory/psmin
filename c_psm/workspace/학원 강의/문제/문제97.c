#include<stdio.h>
void main() {
	int n = 0;
	int game[19][19] = { 0, };
	int x = 0, y = 0;

	for (int i = 0; i < 19; i++) {
		for (int j = 0; j < 19; j++) {
			scanf_s("%d ", &game[i][j]);
		}
	}
	scanf_s("%d", &n);
	for (int i = 0; i < n; i++) {
		scanf_s("%d %d", &x, &y);
		for (int j = 0; j < 19; j++) {
			if (game[x - 1][j]) { game[x - 1][j] = 0; }
			else { game[x - 1][j] = 1; }
		}
		for (int j = 0; j < 19; j++) {
			if (game[j][y - 1]) { game[j][y - 1] = 0; }
			else { game[j][y - 1] = 1; }
		}
	}

	for (int i = 0; i < 19; i++) {
		for (int j = 0; j < 19; j++) {
			printf("%d ", game[i][j]);
		}
		printf("\n");
	}
}
