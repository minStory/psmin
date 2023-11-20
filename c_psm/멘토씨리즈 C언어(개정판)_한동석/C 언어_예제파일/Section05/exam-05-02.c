#include <stdio.h>

int main(void) 
{
    int num1 = 3, num2=  4;

    // 복합대입연산자를 통한 초기화
    num1 += 3; // num1 = num1 + 3;
    num2 *= 4; // num2 = num2 * 4;

    printf("num1 += 3 의 결과 : %d\n", num1);
    printf("num2 *= 4 의 결과 : %d\n", num2);

    return 0;
}