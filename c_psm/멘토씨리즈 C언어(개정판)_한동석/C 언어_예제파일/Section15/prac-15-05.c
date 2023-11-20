#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

void printTime(int second)
{
    int hours, minutes, seconds;
    hours = second / 3600;
    minutes = (second % 3600) / 60; 
    seconds = second % 60;
    printf("결과 : %d시간/%d분/%d초\n", hours, minutes, seconds);
}

int main(void)
{
    int second;
    printf("몇 초 : ");
    scanf("%d", &second);
    printTime(second);

    return 0;
}