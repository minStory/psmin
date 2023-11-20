#include<stdio.h>
void main() {

	float a = 0, b = 0, c = 0, d = 0, e = 0;

	printf("국어 점수 : ");
	scanf_s("%f", &a);
	printf("영어 점수 : ");
	scanf_s("%f", &b);
	printf("수학 점수 : ");
	scanf_s("%f", &c);
	printf("사회 점수 : ");
	scanf_s("%f", &d);
	printf("과학 점수 : ");
	scanf_s("%f", &e);

	printf("평균점수는 %.2f 점입니다.",(a+b+c+d+e)/5);



}