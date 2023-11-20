#include <stdio.h>

int totalBetween(int a, int b)
{
    int i;
    int total = 0;
    for(i = a + 1; i < b; i++)
    {
        total += i;
    }

    return total;
}

int main(void)
{
    // 결과 확인을 위해 임의의 숫자를 전달하였습니다.
    int result = totalBetween(5, 9);
    printf("5와 9 사이의 정수의 총합은 : %d\n", result);

    return 0;
}