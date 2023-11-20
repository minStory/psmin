#include <stdio.h>

int main(void)
{
    int num = 999;
    int* ptr = &num; // 변수 num의 주솟값을 싱글 포인터 ptr에 저장
    int** dptr = &ptr; // 싱글 포인터 변수 ptr의 주솟값을 더블 포인터 dptr에 저장
    int*** tptr = &dptr; // 더블 포인터 변수 dptr의 주솟값을 삼중 포인터 tptr에 저장

    printf("%d %d %d %d\n", num, *ptr, **dptr, ***tptr);
    return 0;
}