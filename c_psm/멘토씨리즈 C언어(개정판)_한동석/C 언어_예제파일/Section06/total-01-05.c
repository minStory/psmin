#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void) 
{
    int inputSeconds;
    int hour, min, sec;

    printf("초를 입력하세요 : ");
    scanf("%d", &inputSeconds);

    hour = inputSeconds / (60 * 60);
    min = inputSeconds % (60 * 60) / 60;
    sec = inputSeconds % 60;

    printf("%d시간 %d분 %d초\n", hour, min, sec);
    
    return 0;
}