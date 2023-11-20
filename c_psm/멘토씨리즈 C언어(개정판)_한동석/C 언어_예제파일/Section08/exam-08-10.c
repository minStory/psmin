#include <stdio.h>

int main(void)
{
    int num;

    for(num = 1; num <= 5; num++)
    {
        if(num == 3)
            continue; // num이 3이면 처음으로 돌아가라!
        printf("%d\n", num);
    }

    return 0;
}