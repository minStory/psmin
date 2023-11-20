#include<stdio.h>
void main() {
	int i, j;
	int arr[2][3] = {
		{1,2,3},
		{4,5,6}
	};

	for (i = 0; i < 2; i++) {		//2차원배열 값 출력
		for (j = 0; j < 3; j++) {
			printf("%d ", arr[i][j]);
		}
		printf("\n");
	}

	for (i = 0; i < 2; i++) {		//2차원배열 값 모두 10으로 변경
		for (j = 0; j < 3; j++) {
			arr[i][j] = 10;
		}
	}

	for (i = 0; i < 2; i++) {		//10으로 변경된 2차원배열 값 출력
		for (j = 0; j < 3; j++) {
			printf("%d ", arr[i][j]);
		}
		printf("\n");
	}

}