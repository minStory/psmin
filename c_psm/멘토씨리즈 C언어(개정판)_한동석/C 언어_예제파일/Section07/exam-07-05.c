#include <stdio.h>

int main(void)
{
    int num1 = 5, num2 = 8;

    // 첫 번째 if의 조건이 참
    if(num2 > 5) 
    {
        if(num1 == 5)
            printf("The first if state!");
    }

    // 첫 번째 if의 조건이 거짓 
    if(num2 < 5) 
    {
        if(num1 == 5)
            printf("The second if state!");
    }

    return 0;
}