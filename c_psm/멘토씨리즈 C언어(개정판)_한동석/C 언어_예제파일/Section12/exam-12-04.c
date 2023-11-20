#include <stdio.h>

int main(void) 
{
    // 2개의 행과 3개의 열로 이루어진 2차원 배열
    int arr[2][3] = {
        {1,2,3},
        {4,5,6}
    };
    int i, j;

    // 열이 3개인 2차원 배열의 포인터!
    int (*arrptr)[3] = arr;

    // 포인터 변수를 통한 배열 요소의 출력
    for(i = 0; i < 2; i++)
    {
        for(j = 0; j < 3; j++)
        {
            printf("%d ", arrptr[i][j]);
        }
        printf("\n");
    }

    return 0;
}