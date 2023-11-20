#include<stdio.h>
void main() {
	//1번
	//int num1 = 0, num2 = 0;
	//printf("NUM1 : ");
	//scanf_s("%d", &num1);
	//printf("NUM2 : ");
	//scanf_s("%d", &num2);

	//printf("%d && %d = %d\n", num1, num2, num1 && num2);
	//printf("%d || %d = %d\n", num1, num2, num1 || num2);
	//printf("%d & %d = %d\n", num1, num2, num1 & num2);
	//printf("%d | %d = %d\n", num1, num2, num1 | num2);

	//2번
	//int dec = 0, choice = 0;
	//printf("10진수 정수 입력 : ");
	//scanf_s("%d", &dec);
	//printf("몇 진수로 출력할까요? 8진수는 1 입력, 16진수는 2 입력 : ");
	//scanf_s("%d", &choice);
	//printf(choice == 1 ? "결과 : %o" : "결과 : %X",dec);

	//3번
	//int peach = 0, fullBasket = 0, basket=0;

	//printf("복숭아의 개수는 : ");
	//scanf_s("%d", &peach);

	//fullBasket = peach / 10;
	//basket = fullBasket + (peach % 10 ? 1 : 0);
	//
	//printf("필요한 바구니의 수 : %d\n", basket);

	//4번
	//int num = 0;

	//printf("NUM : ");
	//scanf_s("%d", &num);

	//printf("%d\n", (int)num-((int)num/10)*10);

	//printf("%d\n", num % 10);

	//5번
	int hour = 0, min = 0, sec = 0;

	printf("초를 입력하세요 : ");
	scanf_s("%d", &sec);
	
	hour = sec / (60 * 60);
	//min = sec / 60 - hour * 60;
	min = sec % (60 * 60) / 60;
	sec = sec % 60;

	printf("%d시간 %d분 %d초", hour, min, sec);

}
