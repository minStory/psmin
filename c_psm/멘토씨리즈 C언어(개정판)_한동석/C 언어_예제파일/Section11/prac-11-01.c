#include <stdio.h> 

int main(void)
{
    int arr[5] = {10, 20, 30, 40, 50};
    int * ptr = &arr[0];
    int i;

    for(i = 0; i < 5; i++)
    {
        printf("%d ", *(ptr+i));
    }
    printf("\n");
    
    return 0;
}