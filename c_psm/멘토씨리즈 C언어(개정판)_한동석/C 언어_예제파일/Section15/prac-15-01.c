#include <stdio.h>

void arithmetic(int a, int b)
{
    printf("덧셈 결과 : %d\n", a + b);
    printf("뺄셈 결과 : %d\n", a - b);
    printf("곱셈 결과 : %d\n", a * b);
    printf("나눗셈 결과 : %d\n", a / b);
}

int main(void)
{
    // 결과 확인을 위해 임의의 숫자를 전달하였습니다.
    arithmetic(6, 3);

    return 0;
}