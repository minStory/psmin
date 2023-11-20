#include<stdio.h>
void main() {
	int age = 0;

	printf("나이를 입력하세요 : ");
	scanf_s("%d", &age);

	if (age>=65 || age<6){
		printf("무료");
	}
	else if (age >= 19) {
		printf("1250원");
	}
	else if (age >= 13) {
		printf("900원");
	}
	else if (age >= 6) {
		printf("500원");
	}



}