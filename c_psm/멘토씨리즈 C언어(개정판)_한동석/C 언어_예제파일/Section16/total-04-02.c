#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <time.h> 

int main(void) 
{
    srand((unsigned int)time(NULL));
    int ranNum = rand() % 10 + 1; // 난수를 발생시켜 반환 
    int i, guess;

    while(1) 
    {
        printf("난수를 맞춰보세요(1~10) 사이 : ");
        scanf("%d", &guess);
        
        if(guess == ranNum)
        {
            printf("정답입니다. 프로그램을 종료합니다.\n");
            break;
        }
        else
        {
            printf("틀렸습니다. 재시도!\n");
        }
    }

    return 0;
}