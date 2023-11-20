#include <stdio.h>

int main(void)
{
    char good[] = "Good!";
    char * bad = "Bad!";
    printf("%s %s", good, bad);
 
    // 배열 기반의 문자열 변수 
    good[0] = 'H'; // 가능
    good = "New Good"; // 불가능 
 
    // 포인터 기반의 문자열 변수 
    bad[0] = 'S'; // 불가능
    bad = "New Bad"; // 가능 
 
    return 0;
}