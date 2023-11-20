#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h> 

int main(void)
{
    char word[30];
    int max = 0; // 아스키 코드 최댓값 구하기 
    int i = 0;
    
    printf("영단어 입력 : ");
    scanf("%s", word);

    while(word[i] != '\0')
    {
        if(word[i] > max)
            max = word[i];

        i++;
    }

    printf("아스키코드가 가장 큰 문자 : %c\n", max);

    return 0; 
}