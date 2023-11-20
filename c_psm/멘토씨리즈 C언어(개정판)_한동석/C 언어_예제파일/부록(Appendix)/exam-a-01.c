#include <stdio.h>

int main(void)
{
    int num1 = 255; // 10진수
    int num2 = 0xFF; // 16진수
    int num3 = 0377; // 8진수
    int num4 = 0b11111111; // 2진수
    
    printf("%d %d %d %d", num1, num2, num3, num4);
    
    return 0;
}