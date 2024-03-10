#include<stdio.h>
int addSum(int a) {
	int sum = 0;	//더한 값을 누적할 변수 선언
	for (int i = 0; i <= a; i++) {	//i를 a까지 sum에 담기 반복
		sum += i;
	}
	return sum;	//sum을 값으로 내보낼 것이다.
}


void main() {
	int a = 0;
	scanf_s("%d", &a);
	printf("%d", addSum(a)); //함수에 a를 적용시킨 값을 불러온다.
}