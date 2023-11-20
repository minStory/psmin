#include <stdio.h>

void sayHello()
{
    printf("Hello!\n");
    sayHello(); // 자기 자신을 다시 호출한다.
}

int main(void) 
{
    // 재귀호출 함수 호출
    sayHello();
    
    return 0;
}