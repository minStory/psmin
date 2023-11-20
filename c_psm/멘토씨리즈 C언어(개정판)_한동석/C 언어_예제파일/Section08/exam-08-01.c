#include <stdio.h>

int main(void)
{
    int num = 0;

    while(num < 3) 
    {
        printf("num is %d now\n", num);
        num++; // 조건에 중요한 역할을 하는 변수의 값 변경 
    }

    return 0;
}