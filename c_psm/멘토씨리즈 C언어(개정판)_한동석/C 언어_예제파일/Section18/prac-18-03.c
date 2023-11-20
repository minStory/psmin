#include <stdio.h> 
#include <stdlib.h>

int main(void)
{
    int len, i;
    char * str;
    int numOfa = 0;

    printf("문자열의 최대 길이는 ? ");
    scanf("%d", &len);

    str = (char *)malloc(sizeof(char) * len);
    
    printf("문자열 입력 : ");
    scanf("%s", str);

    for(i = 0; i < len; i++)
    {
        if(str[i] == '\0')
            break;

        if(str[i] == 'a')
            numOfa += 1;      
    }

    printf("a의 개수는 : %d개입니다.\n", numOfa);

    return 0; 
}