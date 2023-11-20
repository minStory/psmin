#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void) 
{
    int num, jinsu;

    printf("10진수 정수 입력 : ");
    scanf("%d", &num);

    printf("몇 진수로 출력할까요? 8진수는 1 입력, 16진수는 2 입력 : ");
    scanf("%d", &jinsu);

    printf(jinsu == 1 ? "결과 : %o":"결과 : %x", num);
    printf("\n");

    return 0;
}