#include <stdio.h>

// 함수도 메모리 공간에 저장되므로 주소 할당됨
int myFunc(int num1, int num2)
{
    printf("num1 : %d, num2 : %d\n", num1, num2);
}

int main(void) 
{
    /*
    매개변수로 int형 변수 두 개가 선언되어 있고, 
    int형 데이터를 반환하는 함수의 주소를 저장할 수 있는
    함수 포인터 fptr의 선언!
    */     
    int (*fptr)(int,int);

    fptr = myFunc; // 함수 포인터 저장!
    fptr(9, 6);

    return 0;
}