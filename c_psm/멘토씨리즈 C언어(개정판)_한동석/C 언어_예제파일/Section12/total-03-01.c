#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void) 
{
    int arr[5];
    int i, max, min, total = 0;

    for(i = 0; i < 5; i++) 
    {
        printf("NUM%d : ", i + 1);
        scanf("%d", &arr[i]);

        if(i == 0)
        {
            max = arr[i];
            min = arr[i];
        }
        else
        {
            if(arr[i] > max) max = arr[i];
            if(arr[i] < min) min = arr[i];
        }

        total += arr[i];
    }

    printf("최댓값 : %d\n최솟값 : %d\n총합계 : %d\n", max, min, total);

    return 0;
}