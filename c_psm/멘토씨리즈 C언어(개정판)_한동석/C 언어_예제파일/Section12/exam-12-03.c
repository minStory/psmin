#include <stdio.h>

int main(void) 
{
    int i, j;

    // 3차원 배열 선언과 동시에 초기화 
    int arr[2][3][4] = {
        {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
        },
        {
            {21,22,23,24},
            {25,26,27,28},
            {29,30,31,32}
        }
    };

    // 3차원 배열의 첫번째 2차원 배열 값 출력 
    for(i = 0; i < 3; i++)
    {
        for(j = 0; j < 4; j++)
        {
            printf("%d ", arr[0][i][j]);
        }
        printf("\n");
    }
    printf("\n");

    // 3차원 배열의 두번째 2차원 배열 값 출력 
    for(i = 0; i < 3; i++)
    {
        for(j = 0; j < 4; j++)
        {
            printf("%d ", arr[1][i][j]);
        }
        printf("\n");
    }

    return 0;
}