#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void)
{
    int num1, num2, num3;
    float fnum1, fnum2;

    printf("세 개의 정수 입력 : ");
    scanf("%d %d %d", &num1, &num2, &num3);
    printf("입력된 정수들 : %d %d %d \n", num1, num2, num3);

    printf("실수, 정수, 실수 차례대로 입력 : ");
    scanf("%f %d %f", &fnum1, &num1, &fnum2);
    printf("입력된 값들 : %0.2f %d %0.2f \n", fnum1, num1, fnum2);

    return 0;
}