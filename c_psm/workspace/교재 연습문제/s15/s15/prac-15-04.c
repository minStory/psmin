#include<stdio.h>
void main() {
	int height = 0;
	printf("키를 cm 단위로 입력하세요 : ");
	scanf_s("%f", &height);
	result(height);
}
int result(float height) {
	height /= 100;
	printf("결과 : %.2fm", height);
	
}