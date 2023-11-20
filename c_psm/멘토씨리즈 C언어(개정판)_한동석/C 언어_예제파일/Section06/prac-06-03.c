#include <stdio.h> 

int main(void)
{
    unsigned char num1 = 3; // 3: 0000 0011 
    unsigned char num2 = 24; // 24: 0001 1000

    printf("%d\n", num1 << 3); 
    printf("%d\n", num2 >> 2);

    return 0; 
}