#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void) 
{
    double num;
    int result;

    printf("NUM : ");
    scanf("%lf", &num);

    result = (int)num % 10;
    printf("결과 : %d\n", result);
    
    return 0;
}