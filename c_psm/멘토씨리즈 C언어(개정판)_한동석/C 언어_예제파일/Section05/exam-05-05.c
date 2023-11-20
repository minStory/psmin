#include <stdio.h>

int main(void) 
{
    int num1 = 3, num2 = 5;

    // 곱하기, 더하기, postfix 증가 연산자를 포함한 연산식
    int result = num1++ + num2 * 3;
    
    printf("연산 결과 : %d\n", result);
    
    return 0;
}