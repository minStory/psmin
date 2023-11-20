#include <stdio.h> 

int main(void)
{
    int num = 3;

    if(num == 2) 
    {
        printf("state 1\n"); 
    }
    else if(num > 2 && num < 4) 
    {
        printf("state 2\n"); 
    }
    else if(num == 3) 
    {
        printf("state 3\n"); 
    }
    else
    {
        printf("state 3\n");
    }

    return 0; 
}