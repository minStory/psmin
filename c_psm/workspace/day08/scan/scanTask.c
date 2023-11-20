#include<stdio.h>
void main() {

	//정수 2개를 입력받은 후 몫과 나머지 출력
	int num1 = 0, num2 = 0, value = 0, rest = 0;

	printf("첫번째 정수 : ");
	scanf_s("%d", &num1);

	printf("두번째 정수 : ");
	scanf_s("%d", &num2);

	value = num1 / num2;
	rest = num1 % num2;

	printf("몫 : %d\n", value);
	printf("나머지 : %d", rest);

}