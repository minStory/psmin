#include<stdio.h>

int fac(int num) { //재귀함수
	if (num == 1) {
		return 1;
	}
	else {
		return num * fac(num - 1);
	}
}

//num * fac(num-1) //3대입
//
//3   * fac(2) 
//3   * (2 * fac(1)) //fac(1) = 1
//3   * (2 * 1)) = 6

void main() {

	int result;

	printf("숫자 입력 : ");
	scanf_s("%d", &result);

	printf("%d! = %d",result, fac(result));
}