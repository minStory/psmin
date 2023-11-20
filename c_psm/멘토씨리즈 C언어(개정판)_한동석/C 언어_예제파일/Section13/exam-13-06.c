#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h>

int main(void) 
{
    char str1[50] = "Michael ";
    char str2[50] = "Michael ";
    
    // str1 에 문자열 붙이기 
    strcat(str1, "Bolton");
    printf("%s\n", str1);
    
    // str2 에 6개의 문자 붙이기 
    strncat(str2, "Jackson Five", 7);
    printf("%s\n", str2);
    
    // str1 과 str2 비교 
    printf("비교 결과 : %d\n", strcmp(str1,str2));
    
    // str1 과 str2 앞의 7개 문자만 비교 
    printf("비교 결과 : %d\n", strncmp(str1,str2, 7));
    
    return 0;
}