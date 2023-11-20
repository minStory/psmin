#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h> 

int main(void)
{
    char character;

    while(1)
    {
        printf("입력하세요 : ");
        scanf(" %c", &character);

        if(65 <= character && 90 >= character)
        {
            printf("%c 입력했습니다. 종료합니다.\n", character);
            break;
        }
        
        printf("%c 입력했습니다.\n", character);
    }

    return 0; 
}