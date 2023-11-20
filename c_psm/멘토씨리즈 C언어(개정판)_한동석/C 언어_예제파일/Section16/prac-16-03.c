#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int recursiveSum(int n)
{
    if(n == 0)
    {
        return 0;
    }

    return n + recursiveSum(n - 1);
}

int main(void)
{
    int n;
    printf("n을 입력하세요 : ");
    scanf("%d", &n);
    int result = recursiveSum(n);
    printf("1부터 n까지의 합 : %d\n", result);

    return 0;   
}