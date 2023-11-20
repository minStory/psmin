#include <stdio.h> 

int main(void)
{
    int number = 10;
    int * pnumber = &number;

    printf("정수 : %d\n", *pnumber);
    printf("주소 : %p\n", pnumber);

    return 0;
}