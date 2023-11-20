#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h>

typedef struct
{
    char name[30];
    char phone[30];
    int salary;
}WORKER;

int main(void)
{
    WORKER persons[3];
    int i;

    for(i = 0; i < 3; i++)
    {
        printf("직원%d 의 이름 : ", i+1);
        scanf("%s", persons[i].name);
        printf("직원%d 의 전화번호 : ", i+1);
        scanf("%s", persons[i].phone);
        printf("직원%d 의 월급여 : ", i+1);
        scanf("%d", &persons[i].salary);
        printf("\n");  
    }

    for(i = 0; i < 3; i++)
    {
        printf("직원%d 의 이름 : %s\n", i+1, persons[i].name);
        printf("직원%d 의 전화번호 : %s\n", i+1, persons[i].phone);
        printf("직원%d 의 월급여 : %d\n", i+1, persons[i].salary);
        printf("\n");  
    }
    
    return 0;
}