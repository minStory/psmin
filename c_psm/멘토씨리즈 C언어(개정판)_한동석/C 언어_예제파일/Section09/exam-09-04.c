#include <stdio.h>

int main(void) 
{
    char mind[30] = "I Love programming!"; 
    printf("%s\n", mind);

    mind[7] = '\0'; // 8번째 요소로 null 문자 삽입
    printf("%s\n", mind);

    mind[1] = '\0'; // 2번째 요소로 null 문자 삽입
    printf("%s\n", mind);

    return 0;
}