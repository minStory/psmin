//f(x) = 2x + 1
//단, x는 정수이다.
#include<stdio.h>


int f(int x) {
	int result = 2 * x + 1;
	return result;
}

//실행 프로그램을 만들어주는 함수

void main() {
	int result = f(3);

		printf("%d", result);
}