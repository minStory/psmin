#include <stdio.h> 

int main(void)
{
    int arr[8] = {1, 2, 3, 4, 5, 6, 7, 8};
    int * ptr = &arr[7];
    int i, total = 0;

    for(i = 7; i >= 0; i--)
    {
        if(*(ptr-i) % 2)
            total += *(ptr-i);
    }
    printf("배열 요소 중 홀수의 총합은 : %d\n", total);
    
    return 0;
}