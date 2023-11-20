#include <stdio.h>

int main(void) 
{
    int i, j;
    int arr[2][3] = {
        {1,2,3},
        {4,5,6}
    };

    // 전체 출력하기 
    for(i = 0; i < 2; i++)
    {
        for(j = 0; j < 3; j++)
        {
            printf("%d ", arr[i][j]);
        }
        printf("\n");
    }

    // 배열 요소 값을 모두 10으로 변경하기 
    for(i = 0; i < 2; i++)
    {
        for(j = 0; j < 3; j++)
        {
            arr[i][j] = 10; 
        }
    }

    // 다시 전체 출력하기 
    for(i = 0; i < 2; i++)
    {
        for(j = 0; j < 3; j++)
        {
            printf("%d ", arr[i][j]);
        }
        printf("\n");
    }

    return 0;
}