#include <stdio.h>

// 사용자 정의 함수의 선언 
int add(int a, int b)
{
    // 입력받은 두 개의 값을 더하여 반환하겠다! 
    return a+b;
}

int main(void) 
{
    int result;

    // 사용자 정의 함수 호출 
    result = add(3, 5);
    printf("함수가 반환한 값 : %d\n", result);

    return 0;
}