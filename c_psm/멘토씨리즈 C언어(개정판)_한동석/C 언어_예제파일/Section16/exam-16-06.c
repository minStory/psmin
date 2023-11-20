#include <stdio.h>

// count는 종료 조건을 위한 매개변수 
int sayHello(int count)
{
    printf("Hello!\n");

    // count가 3이 되면 더이상 재귀호출을 하지 않는다.
    if(count != 3){
        sayHello(count + 1); 
    }
    
    return 0;
}

int main(void) 
{
    // 재귀호출 함수 호출
    sayHello(1);

    return 0;
}