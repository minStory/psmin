#include <stdio.h>

// 전역변수 number
int number = 0;

void printNumber(void)
{
    printf("전역 변수 number는 %d을 저장하고 있다!\n", number);
}

int main(void) 
{
    // 지역변수 number
    int number = 3;
    printf("지역 변수 number는 %d을 저장하고 있다!\n", number);
    printNumber();
    
    return 0;
}