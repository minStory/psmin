#include <stdio.h>

int main(void)
{
    char character = 'H';
    int num = 548;
    printf("%5c\n", character);
    printf("%-5c\n", character);
    printf("%10d\n", num);
    printf("%-10d\n", num);
    
    return 0;
}