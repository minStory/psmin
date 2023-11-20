#include <stdio.h> 

int main(void)
{
    char googoo[4][9];
    int i, j; // 반복문을 위한 변수 

    // 각 요소에 차례대로 접근하여 초기화하기 
    for(i = 0; i < 4; i++)
    {
        for(j = 0; j < 9; j++)
        {
            googoo[i][j] = (i + 2) * (j + 1);
        }
    }

    // 각 요소를 출력하기
    for(i = 0; i < 4; i++)
    {
        for(j = 0; j < 9; j++)
        {
            printf("%-4d", googoo[i][j]);
        }
        printf("\n");
    }
    
    return 0;
}