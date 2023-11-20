#include <stdio.h>

// 매개변수로 포인터 변수 ptr1 과 ptr2 선언
void swapNumber(int *ptr1, int *ptr2)
{
    // 실제 주소 안에 저장된 값을 서로 교환한다.
    int temp = *ptr1;
    *ptr1 = *ptr2;
    *ptr2 = temp;
    printf("함수 안에서 확인한 결과, num1 : %d num2 : %d\n", *ptr1,*ptr2);
}

int main(void) 
{
    int number1 = 33, number2 = 99;
    swapNumber(&number1, &number2); // 각 변수의 '주소'를 인자로 전달한다.
    printf("함수 호출 완료 후 확인한 결과, number1 : %d number2 : %d\n", number1,number2);
    
    return 0;
}