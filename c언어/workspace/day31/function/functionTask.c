#include<stdio.h>

//1~10까지의 합을 구해주는 함수
	int getTotalFrom1To10() {
		int total = 0;
		for (int i = 0; i < 10; i++) {
			total += i + 1;
					}
		return total;
	}

//홀수를 짝수로 짝수를 홀수로 바꿔주는 함수
	int change(int num) {
		return ++num;
	}
//5개의 정수를 입력받고 최소값과 최대값을 구해주는 함수
	int* getMaxAndMin(int arData[]) {
		int maxAndMin[2] = { 0, };
		int max = arData[0];
		int min = arData[0];

		for (int i = 1; i < 5; i++) {
			if (max < arData[i]) { max = arData[i]; }
			if (min > arData[i]) { min = arData[i]; }
		}
		maxAndMin[0] = max;
		maxAndMin[1] = min;

		return maxAndMin;
	}

	void printFrom1To10();
	int getTotalFrom1(int);

	void main() {
		//printFrom1To10();
		printf("%d", getTotalFrom1(10));
	}

	//1~10까지 printf()로 출력하는 함수
	void printFrom1To10() {
		for (int i = 0; i < 10; i++) {
			printf("%d\n", i + 1);
		}
	}

	//1~n까지의 합을 구해주는 함수
	int getTotalFrom1(int end) {
		int total = 0;
		for (int i = 0; i < end; i++) {
			total += i + 1;
		}
		return total;
	}