#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h> 

int main(void)
{
    int age;

    printf("나이를 입력하세요 : ");
    scanf("%d", &age);

    if(age >= 6 && age < 13)
    {
        printf("요금은 500원입니다!\n");
    }
    else if(age >= 13 && age < 19)
    {
        printf("요금은 900원입니다!\n");
    }
    else if(age >= 19 && age < 65)
    {
        printf("요금은 1250원입니다!\n");
    }
    else
    {
        printf("요금은 무료입니다!\n");
    }

    return 0; 
}