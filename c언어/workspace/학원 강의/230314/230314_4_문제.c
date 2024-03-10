#include<stdio.h>
void swap(int* a, int* b) {
	int* temp = 0;

	temp = *a;
	*a = *b;
	*b = temp;

}

void main() {

	int num1 = 10, num2 = 20;


	printf("num1의 값은 : %d\n", num1);
	printf("num1의 값은 : %d\n", num2);

	swap(&num1, &num2);

	printf("%d %d", num1, num2);


	//복습

	//포인터 사용 시 주의점
	
	//포인터 변수 선언 시 초기화 하기

	//NULL포인터 사용하기

	//포인터 자료형과 변수의 자료형 일치

	//절대 주소 사용 하지 않기




}
