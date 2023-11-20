#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void)
{
    int num;

    // 무한루프 적용된 실행문으로, Ctrl+C를 입력하여 강제 종료 가능.
    while(1) 
    {
        printf("무한 반복중... 숫자를 입력하세요 : ");
        scanf("%d", &num);
        printf("%d을(를) 입력하셨네요.\n", num);
    }

    return 0;
}