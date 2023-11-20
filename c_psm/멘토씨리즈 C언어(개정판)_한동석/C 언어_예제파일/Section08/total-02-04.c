#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#define PLUS '+'
#define MINUS '-'
#define MULTIPLICATION '*'
#define DIVISION '/'
#define REMAINDER '%'

int main(void) 
{
    int num1, num2;
    char sign;

    printf("항1 : ");
    scanf("%d", &num1);
    printf("연산자 : ");
    scanf(" %c", &sign);
    printf("항2 : ");
    scanf("%d", &num2);

    switch(sign)
    {
        case PLUS:
            printf("%d %c %d = %d\n", num1, sign, num2, num1 + num2);
            break;
        case MINUS:
            printf("%d %c %d = %d\n", num1, sign, num2, num1 - num2);
            break;
        case MULTIPLICATION:
            printf("%d %c %d = %d\n", num1, sign, num2, num1 * num2);
            break;
        case DIVISION:
            printf("%d %c %d = %d\n", num1, sign, num2, num1 / num2);
            break;
        case REMAINDER:
            printf("%d %c %d = %d\n", num1, sign, num2, num1 % num2);
            break;
    }

    return 0;
}