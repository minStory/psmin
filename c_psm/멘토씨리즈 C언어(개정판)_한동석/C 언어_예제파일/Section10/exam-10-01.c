#include <stdio.h>

int main(void) 
{
    char cnum = 5;
    int inum = 999;
    double dnum = 3.14;

    char * cptr = &cnum;
    int * iptr = &inum;
    double * dptr = &dnum;

    // 포인터 변수의 출력에는 형식문자 %p를 사용할 수 있다
    printf("%p\n", cptr);
    printf("%p\n", iptr);
    printf("%p\n", dptr);

    return 0;
}