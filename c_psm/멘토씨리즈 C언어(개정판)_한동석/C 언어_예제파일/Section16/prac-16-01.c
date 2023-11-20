#include <stdio.h>

int getDiffByValue(int number1, int number2)
{
    int result;
    result = number1 - number2;
    result = result >= 0 ? result : result * -1;

    return result;
}

void callDiffByRef(int * number1, int * number2)
{
    if(*number1 < *number2)
    {
        int temp = *number1;
        *number1 = *number2;
        *number2 = temp;
    }
}

int main(void)
{
    // 결과 확인을 위해 임의의 숫자로 초기화하였습니다
    int number1 = 3, number2 = 5;

    // 두 수의 차를 구하는 함수 호출 
    printf("두 수의 차는 : %d\n", getDiffByValue(number1, number2));

    // 더 큰 수를 number1에 저장하는 함수 호출 
    callDiffByRef(&number1, &number2);
    printf("number1: %d number2: %d \n", number1, number2);

    return 0;
}