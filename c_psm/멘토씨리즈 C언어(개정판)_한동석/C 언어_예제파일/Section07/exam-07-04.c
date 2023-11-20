#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void)
{
    int num;
    printf("input your number : ");
    scanf("%d", &num);

    if(num == 2)
        printf("your number is 2");
    else if(num == 4)
        printf("your number is 4");
    else if(num == 8)
        printf("your number is 8");
    /*
    else 절이 사용되지 않았다!
    */

    return 0;
}