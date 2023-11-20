#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h>

struct worker
{
    char name[30];
    char phone[30];
    int salary;
};

int main(void)
{
    struct worker person;
    
    printf("직원의 이름 : ");
    scanf("%s", person.name);
    printf("직원의 전화번호 : ");
    scanf("%s", person.phone);
    printf("직원의 월급여 : ");
    scanf("%d", &person.salary);

    printf("\n");

    printf("직원의 이름 : %s\n", person.name);
    printf("직원의 전화번호 : %s\n", person.phone);
    printf("직원의 월급여 : %d\n", person.salary);
   
    return 0;
}