#include<stdio.h>
void main() {
	int house[10][10] = { 0, };
	int i = 0, j = 0;

	for (i = 0; i < 10; i++) {
		for (j = 0; j < 10; j++) {
			scanf_s("%d", &house[i][j]);
		}
	}
	i = 1, j = 1;
	while (house[i][j] == 0 || house[i][j] == 2) {
		switch (house[i][j]) {
		case 0:
			house[i][j] = 9;
			if (house[i][j + 1] == 1) { i++; }
			else { j++; }
			break;
		case 2:
			house[i][j] = 9;
			break;
		}
	}
	for (i = 0; i < 10; i++) {
		for (j = 0; j < 10; j++) {
			printf("%d ", house[i][j]);
		}
		printf("\n");
	}

}
