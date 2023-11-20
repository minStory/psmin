#include <stdio.h> 

int main(void)
{
    int n1 = 100, n2 = 200; 
    int * ptr1 = &n1;
    int * ptr2 = &n2;

    printf("%d %d\n", *ptr1, *ptr2); 
    
    int temp = *ptr2;
    *ptr2 = *ptr1;
    *ptr1 = temp;

    printf("%d %d\n", *ptr1, *ptr2); 
    
    return 0;
}