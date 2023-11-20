#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void) 
{
    int start, end;
    int dan, mul;
    int temp;

    printf("start : ");
    scanf("%d", &start);

    printf("end : ");
    scanf("%d", &end);

    if(start > end)
    {
        temp = start;
        start = end;
        end = temp;
    }

    for(dan = start; dan <= end; dan++)
    {
        for(mul = 1; mul < 10; mul++)
        {
            printf("%-3d", dan * mul);
        }
        printf("\n");
    }
    
    return 0;
}