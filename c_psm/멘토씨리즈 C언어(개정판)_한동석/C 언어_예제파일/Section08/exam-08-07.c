#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void)
{
    int num = 0;
    for( ; num != -1 ; ) 
    {
        printf("숫자를 입력하세요(-1 입력시 종료) : ");
        scanf("%d", &num);
    }

    return 0;
}