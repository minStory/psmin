#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h> 

int main(void)
{
    char word[30];
    int i = 0, length = 0; // 단어의 길이
    
    printf("영단어 입력 : ");
    scanf("%s", word);

    // 단어의 길이 구하기 
    while(1)
    {
        if(word[i] == '\0')
            break;
        
        length++;
        i++;
    }

    printf("뒤집은 결과 : ");
    for(i = length; i >= 0; i--)
    {
        printf("%c", word[i]);
    }
    printf("\n");

    return 0; 
}