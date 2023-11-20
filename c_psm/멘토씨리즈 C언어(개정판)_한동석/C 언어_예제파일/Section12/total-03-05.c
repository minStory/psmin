#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void) 
{
    int year, month; 
    int i, j, k; 
    int sum = 0; 
    int check = 0; 
    int days[12] = {31,28,31,30,31,30,31,31,30,31,30,31};

    printf("출력할 연도 : ");
    scanf("%d", &year);
    printf("출력할 달 : ");
    scanf("%d", &month);

    if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)) 
    {
        check = 1;
        days[1]++;
    }
    else 
    {
        check = 0;
    }

    sum = 365;

    for (i = 1; i < year; i++) 
    {
        if (((i % 4 == 0) && !(i % 100 == 0)) || (i % 400 == 0)) 
        {
            sum += 366;
        }
        else 
        {
            sum += 365;
        }
    }

    for (i = 0; i < month - 1; i++) 
    {
        sum += days[i];
    }

    k = sum % 7;

    //출력
    printf("SUN\tMON\tTUS\tWED\tTHU\tFRI\tSAT\n");
    printf("===================================================\n");

    for (j = 0; j < k; j++) 
    {
        printf("\t");
    }

    for (i = 1; i <= days[month - 1]; i++) 
    {
        printf("%3d\t", i);
        if (k == 6) 
        {
            k = -1;
            printf("\n");
        }
        k++;
    }
    printf("\n");

    return 0;
}