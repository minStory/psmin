#include <stdio.h>

char* strcpy_custom(char* dest, char* origin);         

int main(void)
{
    char str[80] = "good";

    printf("바꾸기 전 문자열 : %s\n", str);
    strcpy_custom(str, "bad");                  
    printf("바꾼 후 문자열 : %s\n", str);
    printf("다른 문자열 대입 : %s\n", strcpy_custom(str, "nice"));   

    return 0;
}

char* strcpy_custom(char* dest, char* origin)  
{
    char* po = dest;                  
    while (*origin != '\0')              
    {
        *dest = *origin;                 
        dest++;                       
        origin++;                    
    }
    *dest = '\0';                   

    return po;                     
}