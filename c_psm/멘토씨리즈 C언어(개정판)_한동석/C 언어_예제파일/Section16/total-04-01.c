#include <stdio.h>
#include <stdlib.h>

int main(void) 
{
    int ranNum = rand(); // 난수를 발생시켜 반환 
    int i;

    for(i = 0; i < 5; i++) 
    {
        printf("%d\n", ranNum % 10);
        ranNum = rand(); 
    }

    return 0;
}