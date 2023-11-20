#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <time.h> 

void game(void)
{
    srand((unsigned int)time(NULL));
    int computer = rand() % 3 + 1; 
    int me;
    
    printf("가위 1 바위 2 보 3\n당신의 선택은 : ");
    scanf("%d", &me);

    if(me == 1)
    {
        printf("당신은 가위, ");
        printf(computer == 1 ? "컴퓨터 난수는 가위, 비겼습니다." :
        computer == 2 ? "컴퓨터 난수는 바위, 졌습니다." :
        "컴퓨터 난수는 보, 이겼습니다.");
    }
    else if(me == 2)
    {
        printf("당신은 바위, ");
        printf(computer == 1 ? "컴퓨터 난수는 가위, 이겼습니다." :
        computer == 2 ? "컴퓨터 난수는 바위, 비겼습니다." :
        "컴퓨터 난수는 보, 졌습니다.");   
    }
    else if(me == 3)
    {
        printf("당신은 보, ");
        printf(computer == 1 ? "컴퓨터 난수는 가위, 졌습니다." :
        computer == 2 ? "컴퓨터 난수는 바위, 이겼습니다." :
        "컴퓨터 난수는 보, 비겼습니다.");   
    }
    printf("\n\n");
}

int main(void) 
{
    game();
    game();

    return 0;
}