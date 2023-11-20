#include<stdio.h>
//& -> 피연산자의 메모리 주소를 반환하는 연산자
//*(곱셈연산자) -> 피연산자가 2개
//*(포인터연산자) -> 피연산자가 1개인 단항연산자
void main() {
	int num1 = 100, num2 = 100;
	int* pnum;	//4바이트인 pnum을 정수형으로 해석

	pnum = &num1;	//pnum이 num1의 주소값을 가리킴
	(*pnum) += 30;	// = num1+=30
	pnum = &num2;
	(*pnum) -= 30;	// = num2-=30

	printf("num1 : %d, num2 : %d\n", num1, num2);
}
