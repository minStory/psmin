#include <stdio.h>

// 더블 포인터 변수를 인자로 전달받는 함수
void swapNumber(int **dptr1, int **dptr2)
{
    // 주소값의 교환
    int *temp = *dptr1;
    *dptr1 = *dptr2;
    *dptr2 = temp;
}

int main(void) 
{
    int num1 = 66, num2 = 99;
    int *ptr1 = &num1;
    int *ptr2 = &num2;
    printf("*ptr1 : %d *ptr2 : %d\n", *ptr1, *ptr2);
    swapNumber(&ptr1, &ptr2); // 정수값의 교환이 아닌, 주소값의 교환이 이루어진다.
    printf("*ptr1 : %d *ptr2 : %d\n", *ptr1, *ptr2);

    return 0;
}