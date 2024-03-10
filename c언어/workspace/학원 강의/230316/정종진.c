#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>

int main(void) {
	int floor[4][2] = { 0 };
		
	for (int i = 0; i < 4; i++) {
		for (int j = 0; j < 2; j++) {
			printf("%d0%d호 거주인원 수 입력 >> ", i + 1, j + 1);
			scanf("%d", &floor[i][j]);
		}
	}
	printf("\n");
	for (int i = 0; i < 4; i++) {
		for (int j = 0; j < 2; j++) {
			printf("%d0%d호 : %d명 ",i+1,j+1,floor[i][j]);
		}
		printf("\n");
	}
	printf("\n");
	for (int i = 0; i < 4; i++) {
		int sum = 0;
		for (int j = 0; j < 2; j++) {
			sum = sum + floor[i][j];
		}
		printf("%d층 : %d명\n", i + 1, sum);
	}
	
	return 0;
}