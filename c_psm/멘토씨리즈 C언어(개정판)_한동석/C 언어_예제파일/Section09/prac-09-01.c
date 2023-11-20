#include <stdio.h> 

int main(void)
{
    int arr[5] = {2, 5, 8, 17, 21};
    int i, total = 0;

    for(i = 0; i < 5; i++)
    {
        total += arr[i]; // 배열 요소의 합 구하기 
    }

    printf("배열 요소의 총합 : %d\n", total);
    printf("배열 요소의 평균 : %0.1f\n", (double)total/5);

    return 0; 
}