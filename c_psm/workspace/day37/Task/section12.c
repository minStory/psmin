#include<stdio.h>
void main() {
	
	//1¹ø
	//char bingo[3][3] = { ' ', };

	//for (int i = 0; i < 3; i++) {
	//	for (int j = 0; j < 3; j++) {
	//		if (i == j) { bingo[i][j] = 'O'; }
	//		else { bingo[i][j] = 'X'; }
	//	printf("%c ", bingo[i][j]);
	//	}
	//	printf("\n");
	//}

	//2¹ø
	//int arr[4][9] = { 0, };

	//for (int i = 0; i < 4; i++) {
	//	for (int j = 0; j < 9; j++) {
	//		arr[i][j] = (i + 2) * (j + 1);
	//		printf("%2d ", arr[i][j]);
	//	}
	//	printf("\n");
	//}

	//3¹ø
	int arr[3][2] = { {6,7},{8,9},{3,4} };

	printf("%d %d \n", arr[1][0], arr[0][1]);
	printf("%d %d \n", *(arr[2] + 1), *(arr[1] + 1));
	printf("%d %d \n", (*(arr + 2))[0], (*(arr + 0))[1]);
	printf("%d %d \n", **arr, *(*(arr + 0) + 0));

}
	