#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

void convertCentiToMeter(int height)
{
    double convertResult; 
    convertResult = (double)height / 100;
    printf("결과 : %0.2f m\n", convertResult);
}

int main(void)
{
    int height;
    printf("키를 cm 단위로 입력하세요 : ");
    scanf("%d", &height);
    convertCentiToMeter(height);
    
    return 0;
}