#include <stdio.h>

// add 함수의 원형(선언부)
int add(int a, int b); 

int main(void) 
{
    int result;

    /*
      add 함수는 main 함수의 위에 이미 선언되어 있으므로
      컴파일러는 프로그램 내에서 add 함수를 찾아낼 수 있다.
    */
    result = add(3, 5);
    printf("함수가 반환한 값 : %d\n", result);

    return 0;
}

// add 함수의 기능(정의부)
int add(int a, int b)
{
    return a+b;
}