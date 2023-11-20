#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void) 
{
    int num, absolute;

    printf("정수 입력 : ");
    scanf("%d", &num);

    absolute = num > 0 ? num : num * -1 ;
    printf("절대값 : %d\n", absolute);

    return 0;
}