//사용자로부터 층별로 두 가구가 사는 4층짜리 빌라의 가구별 거주인원 수를 입력 받는 예제를 작성해보자
//단, 2차원 배열 사용하기
#include<stdio.h>
void main() {
	int apt[4][2] = { {0} };		//4행2열인 2차원배열 선언
	printf("각 집의 거주인원 수 입력\n");
	for (int i = 0; i < 4; i++) {		// 행열 전체 한바퀴 돌면서 배열에  값 입력
		for(int j=0;j<2;j++){
			printf("%d0%d호 : ", i+1, j+1);
			scanf_s("%d", &apt[i][j]);
		}
	}
	int sum = 0;	//층마다 담을 공간변수 선언
	for (int i = 0; i < 4; i++) {
			sum = 0;	//층마다 0으로 초기화
		for (int j = 0; j < 2; j++){
			//printf("%d층 : %d명\n",i+1,apt[i][j]+apt[i][j+1]);
			sum += apt[i][j];	//j호와 j+1호 sum에 담기
		}
		printf("%d층 : %d명\n", i + 1, sum);
	}

}