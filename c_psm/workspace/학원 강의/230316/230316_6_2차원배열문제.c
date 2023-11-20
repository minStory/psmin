//사용자로부터 층별로 두 가구가 사는 4층짜리 빌라의 가구별 거주인원 수를 입력 받는 예제를 작성해보자
//단, 2차원 배열 사용하기
#include<stdio.h>
void main() {

	int arr[4][2] = { {0}, };
	int sum = 0;

	printf("각 호수별 인원수 입력\n");
	for (int i = 0; i < 4; i++) {
		
		for (int j = 0; j < 2; j++) {
			printf("%d0%d호 : ", i + 1, j + 1);
			scanf_s("%d", &arr[i][j]);
		}
	}


	for (int i = 0; i < 4; i++) {
		for (int j = 0; j < 2; j++) {
			sum = 0;
			sum += arr[i][j];
		}
			printf("%d층 총 %d명\n", i + 1, sum);
	}


}