#include<stdio.h>
void main() {

	int num = 0; //초기화


	printf("숫자 입력 : "); //입력표시
	scanf_s("%d", &num); //반복 횟수 입력

	for (int i = 0; i > num; i--) { 
		for (int j = 0; j < i; j++) {
			printf("\n");

		}
		printf("*");
	}




}