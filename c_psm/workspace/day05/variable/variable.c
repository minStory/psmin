#include<stdio.h>
void main() {

	int age = 10;
	float height = 125.3F;
	double weight = 35.956;
	char grade = 'A';
	char* name = "박성민";

	printf("나이 : %d살", age);
	printf("키 : %.1fcm", height);
	printf("몸무게 : %.2lfkg", weight); //소수점을 자를 때 6부터 반올림된다.
	printf("수행평가 : %c등급", grade);
	printf("이름 : %s", name);
}