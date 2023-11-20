#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void)
{
    int num;
    printf("input some positive number : ");
    scanf("%d", &num);

    switch(num) 
    {
        case 1:
            printf("num is 1\n");
            break;
        case 2:
            printf("num is 2\n");
            break;
        case 3:
            printf("num is 3\n");
            break;
        default:
            printf("maybe bigger than 3\n");
            break;
    }
    printf("switch state end.\n");

    return 0;
}