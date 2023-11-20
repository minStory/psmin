#include <stdio.h>

int main(void) 
{
    char value1[30];
    char value2[30];

    gets(value1);
    gets(value2);

    // strlen은 문자열의 길이를 반환!
    if(strlen(value1) >= strlen(value2))
    {
        printf("%s\n%s\n", value1, value2);
    }
    else
    {
        printf("%s\n%s\n", value2, value1);
    }

    return 0; 
}