#include <stdio.h>

int main(void) 
{
    int ch;
    while(1)
    {
        ch = getchar();

        // 입력 문자가 EOF면, 입력이 종료된다!
        if(ch == EOF)
            break; 
        putchar(ch);
    }
    
    return 0;
}