#include <stdio.h> 

int main(void)
{
    int a = 33, b = 66; 
    int *pa = &a;
    int *pb = &b;
    int **ppa = &pa; 
    int **ppb = &pb; 
    int *ptr;
    
    ptr = *ppb; 
    *ppb = *ppa;
    *ppa = ptr;

    printf("%d %d %d %d\n", a, b, *pa, *pb);

    return 0; 
}