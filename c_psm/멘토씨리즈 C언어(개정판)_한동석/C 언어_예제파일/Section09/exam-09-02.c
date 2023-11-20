#include <stdio.h>

int main(void) 
{
    int i;
    int odd[3]; // 초기화 되지 않은 배열 
    int even[5] = {2,4,6,8,10};

    // 배열의 개별 요소 초기화 
    odd[0] = 1; 
    odd[1] = 3; 
    odd[2] = 5;

    // 개별 요소 접근 및 출력 
    printf("%d %d %d\n", odd[0], odd[1], odd[2]);

    // for문을 통한 배열 요소 출력 
    for(i = 0; i < 5; i++)
    {
        printf("%d ", even[i]);
    }
    printf("\n");

    return 0;
}