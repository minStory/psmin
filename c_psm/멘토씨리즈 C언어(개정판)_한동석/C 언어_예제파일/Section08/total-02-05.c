#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void) 
{
    int i, count;
    int one = 1 , two = 1; 
    int next;

    printf("출력 개수 : ");
    scanf("%d", &count);

    for(i = 0; i < count; i++) 
    {
        printf("%d ", one);
        next = one + two;
        one = two;
        two = next;
    }
    printf("\n");
  
    return 0;
}