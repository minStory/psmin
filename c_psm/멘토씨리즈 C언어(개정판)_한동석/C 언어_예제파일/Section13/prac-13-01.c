#include <stdio.h>

int main(void) 
{
    char value1[30];
    char value2[30];

    gets(value1);
    gets(value2);

    // strcmp 는 두 문자열의 값이 같을 시 0을 반환!
    if(!strcmp(value1, value2))
    {
        printf("같습니다.\n");
    }
    else
    {
        printf("같지 않습니다.\n");
    }

    return 0; 
}