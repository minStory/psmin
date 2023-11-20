#include<stdio.h>

int main(void) {

	int i, j;
	int arr[4][2];

	for (i = 0; i < 4; i++) {
		for (j = 0; j < 2; j++) {
			scanf_s("%d", &arr[i][j]);
		}
	}
	for (i = 0; i < 4; i++) {
		int sum=0;
		for (j = 0; j < 2; j++) {
			sum = sum + arr[i][j];
		}
		printf("%dÃþ °¡±¸¼ö : %d\n", i + 1, sum);
	}


	return 0;

}