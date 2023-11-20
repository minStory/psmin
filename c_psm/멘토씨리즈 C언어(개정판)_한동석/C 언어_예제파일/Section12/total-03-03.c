#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void) 
{
    int num, backupNum;
    int digits = 0, i, j;
    int op = 1;

    printf("입력하세요 : ");
    scanf("%d", &num);
    backupNum = num;

    while(1)
    {
        if(num / op == 0)
            break;
        
        op *= 10;
        digits++;
    }

    for(i = digits; i > 0; i--)
    {
        int innerDigits = 1;
        for(j = 1; j < i; j++) 
            innerDigits *= 10; 

        for(j = i; j > 0; j--) 
        {
            printf("%d ", num / innerDigits);
            num -= ((num / innerDigits) * innerDigits);
            if(j == i) backupNum = num;
            innerDigits /= 10;
        }
        num = backupNum;
        printf("\n");
    }

    return 0;
}