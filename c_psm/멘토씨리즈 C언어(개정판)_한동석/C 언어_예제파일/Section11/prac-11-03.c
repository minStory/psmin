#include <stdio.h> 

int main(void)
{
    int arr[8] = {1, 2, 3, 4, 5, 6, 7, 8};
    int * forward = &arr[0];
    int * backward = &arr[7];
    int i;

    // 값의 교환 
    for(i = 0; i < 4; i++)
    {
        int temp = *(forward + i);
        *(forward + i) = *(backward - i);
        *(backward - i) = temp;
    }

    // 교환 후 배열 전체 출력 
    for(i = 0; i < 8; i++)
    {
        printf("%d ", arr[i]);
    }
    printf("\n");
    
    return 0;
}