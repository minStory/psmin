#include <stdio.h>

int main(void) 
{
    int a, b;
    a = 1;

    b = a << 2; // 왼쪽으로 두 칸 이동
    printf("%d << 2 = %d\n", a, b);
    b = a >> 2; //오른쪽 시프트 후 결과 출력 
    printf("%d >> 2 = %d", a, b);
    
    return 0;
}