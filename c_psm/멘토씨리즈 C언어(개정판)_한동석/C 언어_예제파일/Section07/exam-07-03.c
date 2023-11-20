#include <stdio.h>

int main(void)
{
    char alpha = 'C';

    if(alpha == 'A')
    {
        printf("alpha is A.\n");
        printf("I like apple.");
    }
    else if(alpha == 'B')
    {
        printf("alpha is B.\n");
        printf("I like banana.");
    }
    else if(alpha == 'C') 
    {
        printf("alpha is C.\n");
        printf("I like carrot.");
    }
    else 
    {
        printf("I hate fruit & vegetable.");
    }

    return 0;
}