#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void)
{
    int num;
    printf("input some positive number : ");
    scanf("%d", &num);

    switch(num) 
    {
        // break가 생략된 두 개의 case 문을 연달아 작성
        case 1:
        case 3:
        case 5:
            printf("odd\n");
            break;
        // break가 생략된 두 개의 case 문을 연달아 작성
        case 2:
        case 4:
        case 6:
            printf("even\n");
            break;
        default:
            printf("maybe bigger than 6\n");
    }
    printf("switch state end.\n");

    return 0;
}