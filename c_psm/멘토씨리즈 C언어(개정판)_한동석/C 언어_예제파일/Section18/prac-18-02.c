#include <stdio.h> 
#include <stdlib.h>

int main(void)
{
    int arr[5] = {10, 20, 30, 40, 50}; 
    int *pa;
    int *pb;
    int *pc;
    int i;

    pa = (int *)malloc(sizeof(arr));

    for(i = 0; i < 5; i++) 
    {
        pa[i] = arr[i]; 
    }
    
    pb = (int *)calloc(pa[3], sizeof(int)); 
    pc = (int *)realloc(NULL, pa[4]);

    return 0; 
}