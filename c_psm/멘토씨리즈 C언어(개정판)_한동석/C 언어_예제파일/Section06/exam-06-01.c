#include <stdio.h>

int main(void) 
{
    int num1 = 20, num2 = 10;
    int result;

    result = 1 && 1;
    printf("result 1 : %d\n", result);

    result = num1 == 20 && num2 == 10;
    printf("result 2 : %d\n", result);

    result = num1 > num2 && num1 == num2;
    printf("result 3 : %d\n", result);

    return 0;
}