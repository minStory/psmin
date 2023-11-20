#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void)
{
    char character;
    int inum;
    float fnum;

    scanf("%c", &character);
    scanf("%d", &inum);
    scanf("%f", &fnum);

    // scanf 함수는 출력 기능을 지니고 있지 않다. 
    printf("%c %d %f \n", character, inum, fnum);

    return 0;
}