#include <stdio.h>

int main(void) 
{
    int n1 = 3, n2 = 6, n3 = 9;

    // 포인터 변수의 선언 및 초기화
    int * ptr1 = &n1;
    int * ptr2 = &n2; 
    int * ptr3 = &n3;

    // 포인터 배열 선언 및 초기화 
    int * parr[3] = {ptr1, ptr2, ptr3};

    // 주소에 들어있는 값의 출력과 각 주소의 출력
    printf("%d %d %d\n", *parr[0], *parr[1], *parr[2]);
    printf("%p %p %p\n", parr[0], parr[1], parr[2]);

    return 0;
}