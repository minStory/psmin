#include <stdio.h>

int main(void) 
{
    char value[50];
    int i; // 반복문을 위한 변수 
    int total = 0; // 숫자의 총합을 구하기 위한 변수 

    printf("문자열 입력 : ");
    gets(value);

    for(i = 0; i < strlen(value); i++)
    {
        if(value[i] >= 48 && value[i] <= 57)
        {
            total += value[i] - 48;
        }
    }

    printf("숫자의 합은 : %d\n", total);

    return 0; 
}