#include <stdio.h>

int main(void) 
{
    // 변수의 선언 
    int a = 10, b = 10;

    printf("a : %d\n", a); 
    printf("a : %d\n", ++a); // 증가를 먼저 하고 출력한다.
    printf("a : %d\n", a); 

    printf("b : %d\n", b); 
    printf("b : %d\n", b++); // 출력을 먼저 하고 증가한다.
    printf("b : %d\n", b); 

    return 0;
}