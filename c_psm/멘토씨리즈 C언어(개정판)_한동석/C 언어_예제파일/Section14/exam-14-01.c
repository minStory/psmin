#include <stdio.h>

int outer = 10;

int main(void) 
{

    int inner = 3;
    inner++;
    printf("%d\n", inner);
    inner++;

    return 0;
}