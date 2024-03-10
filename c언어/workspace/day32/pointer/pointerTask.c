#include<stdio.h>

//5개의 정수를 입력받고 최소값과 최대값을 구해주는 함수
void getMaxAndMin(int arData[],int* max, int* min) {

	*max = arData[0];
	*min = arData[0];

	for (int i = 1; i < 5; i++) {
		if (*max < arData[i]) { *max = arData[i]; }
		if (*min > arData[i]) { *min = arData[i]; }
	}
}

void main() {
	int arData[5] = { 4,7,3,9,8 };
	int max = 0;
	int min = 0;
	getMaxAndMin(arData, &max, &min);
	printf("최대값 %d\n", max);
	printf("최소값 %d\n", min);

}