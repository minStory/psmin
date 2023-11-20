#include <stdio.h>

int main(void) 
{
    int myArr[3] = {1,2,3};
    printf("배열 각 요소의 주소 확인\n");
    printf("배열의 이름 : %p\n", myArr);
    printf("첫번째 요소 : %p\n", &myArr[0]);
    printf("두번째 요소 : %p\n", &myArr[1]);
    printf("세번째 요소 : %p\n", &myArr[2]);
    
    return 0;
}