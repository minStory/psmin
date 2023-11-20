#include <stdio.h> 

int main(void)
{
    int i;
    for(i = 1; i <= 100; i++)
    {
        if(i % 6 == 0)
        {
           printf("%d ", i);
        }
    }
    printf("\n");

    return 0; 
}