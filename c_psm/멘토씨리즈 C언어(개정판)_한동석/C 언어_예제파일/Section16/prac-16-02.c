#include <stdio.h>

void swapNumbers(int * num1, int * num2, int * num3)
{
    int temp = *num3;
    *num3 = *num2;
    *num2 = *num1;
    *num1 = temp;
}

int main(void)
{
    int num1 = 5, num2 = 8, num3 = 10;

    printf("함수 호출 전 num1 num2 num3 : %d %d %d\n", num1, num2, num3);
    swapNumbers(&num1, &num2, &num3);
    printf("함수 호출 후 num1 num2 num3 : %d %d %d\n", num1, num2, num3);

    return 0;
}