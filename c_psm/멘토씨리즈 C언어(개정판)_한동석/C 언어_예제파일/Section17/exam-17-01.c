#include <stdio.h>

int main(void) 
{
    int num = 3;
    int * ptr1 = &num; // num의 주소를 저장하는 포인터 변수 ptr1
    int ** dptr = &ptr1; // 포인터 변수의 주소값을 저장하는 더블 포인터
    int * ptr2; 

    printf("%p %p\n", ptr1, dptr);
    printf("%d %d\n", num, **dptr);
    ptr2 = *dptr; // ptr1이 저장하고 있는 주소를 ptr2에 저장!
    *ptr2 = 9; // 이는 결국 num = 9; 와 같다
    printf("%d %d\n", num, **dptr);

    return 0;
}