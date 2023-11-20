#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void) 
{
    int arr[8];
    int i, max, min, total = 0;

    for(i = 0; i < 8; i++) 
    {
        printf("NUM%d : ", i + 1);
        scanf("%d", &arr[i]);
    }

    printf("홀수 : ");
    for(i = 0; i < 8; i++) 
    {
        if(arr[i] % 2 == 1)
        {
            printf("%-3d", arr[i]);
        }
    }
    printf("\n");

    printf("짝수 : ");
    for(i = 0; i < 8; i++) 
    {
        if(arr[i] % 2 == 0)
        {
            printf("%-3d", arr[i]);
        }
    }
    printf("\n");

    return 0;
}