#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void)
{
    int num1, num2, num3;

    printf("세 개의 정수 입력 : ");

    // 순서대로 8진수, 16진수, 10진수 입력
    scanf("%o %x %d", &num1, &num2, &num3);
    printf("입력된 정수들 : %d %d %d \n", num1, num2, num3);

    return 0;
}