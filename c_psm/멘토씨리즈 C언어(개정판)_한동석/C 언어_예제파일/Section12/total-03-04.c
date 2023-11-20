#define _CRT_SECURE_NO_WARNINGS   
#include <stdio.h>

int main(void)
{
    char word[30];               
    int length = 0, i;     
    int isPalindromes;          

    printf("문자열 입력 : ");
    scanf("%s", word);

    while(word[length] != '\0')
        length++;

    for(i = 0; i <= length / 2; i++)
    {
        if(word[i] != word[length - i - 1])
        {
            isPalindromes = 0;
            break;
        }

        isPalindromes = 1; // break 되지 않는 경우 계속 '참'을 유지
    }

    printf(isPalindromes ? "동일합니다.\n" : "동일하지 않습니다.\n");

    return 0;
}