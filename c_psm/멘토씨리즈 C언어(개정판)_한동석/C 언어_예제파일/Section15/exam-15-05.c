#include <stdio.h>

int localFunc(int num)
{
    int result = 0;
    return result + num; 
}

int main(void) 
{
    int num = 5;
    int result = localFunc(num);

    printf("결과 : %d\n", result);
    
    return 0;
}