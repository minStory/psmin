#include <stdio.h>

int main(void)
{
    int dan, mul;
    // 단수for문
    for(dan = 2; dan < 10; dan++) 
    {
        // 곱하기 for문
        for(mul = 1; mul < 10; mul++)
            printf("%d ", dan * mul);
        printf("\n");
    }
    
    return 0;
}