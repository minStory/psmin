#include <stdio.h>

int main(void) 
{
    short sarr[2][3][4];
    int iarr[2][3][4];

    printf("size of sarr : %d\n", sizeof(sarr));
    printf("size of iarr : %d\n", sizeof(iarr));

    return 0;
}