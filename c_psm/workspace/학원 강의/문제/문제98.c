#include<stdio.h>
void main() {
	int plate[100][100] = { 0, };
	int h = 0, w = 0, n = 0, l = 0, d = 0, x = 0, y = 0;

	scanf_s("%d %d", &h, &w);
	scanf_s("%d", &n);
	for (int i = 0; i < n; i++) {
		scanf_s("%d %d %d %d", &l, &d, &x, &y);
		for (int j = 0; j < l; j++) {
			if (d) { plate[x - 1 + j][y - 1] = 1; }
			else { plate[x - 1][y - 1 + j] = 1; }
		}

	}
	for (int i = 0; i < h; i++) {
		for (int j = 0; j < w; j++) {
			printf("%d ", plate[i][j]);
		}
		printf("\n");
	}

}
