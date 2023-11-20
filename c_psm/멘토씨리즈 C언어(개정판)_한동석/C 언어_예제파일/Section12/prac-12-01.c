#include <stdio.h> 

int main(void)
{
    char bingo[3][3];
    int i, j; // 반복문을 위한 변수 

    // 각 요소에 차례대로 접근하여 초기화하기 
    for(i = 0; i < 3; i++)
    {
        for(j = 0; j < 3; j++)
        {
            if(i == j)
                bingo[i][j] = 'O';
            else
                bingo[i][j] = 'X';
        }
    }

    // 각 요소를 출력하기
    for(i = 0; i < 3; i++)
    {
        for(j = 0; j < 3; j++)
        {
            printf("%-3c", bingo[i][j]);
        }
        printf("\n");
    }
    
    return 0;
}