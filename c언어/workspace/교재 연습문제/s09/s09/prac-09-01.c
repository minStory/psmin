#include<stdio.h>
void main() {

	int arData[] = {2,5,7,193,17 };
	double sum = 0, avr = 0;


	for (int i = 0; i < 5; i++) {
		sum =sum + arData[i];
	}

	avr = sum / 5;

	printf("%.f\n", sum);
	printf("%.1f\n", avr);

}//합계 및 평균 구하기 완료