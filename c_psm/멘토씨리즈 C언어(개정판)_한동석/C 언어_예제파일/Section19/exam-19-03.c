#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h>

struct person
{
    char name[30];
    int age;
};

int main(void) 
{
    // 길이가 3인 구조체 배열 선언 및 초기화 
    struct person boy[3] = {
        {"김소년", 12},
        {"유소년", 14},
        {"청소년", 16}
    };
    struct person girl[3];
    int i;

    // 개별 변수에 대한 초기화 
    strcpy(girl[0].name, "이소녀");
    strcpy(girl[1].name, "오소녀");
    strcpy(girl[2].name, "하소녀");
    girl[0].age = 9;
    girl[1].age = 13;
    girl[2].age = 7;

    for(i = 0 ; i < 3; i++)
    {
        printf("소년의 이름은 %s, 나이는 %d세\n", boy[i].name, boy[i].age);
        printf("소녀의 이름은 %s, 나이는 %d세\n", girl[i].name, girl[i].age);
    }
    
    return 0;
}