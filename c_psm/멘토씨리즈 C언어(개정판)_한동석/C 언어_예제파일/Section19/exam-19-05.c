#include <stdio.h>

// 구조체 선언과 동시에 typedef 선언
typedef struct
{
    int x; int y;
}POINT;

struct person
{
    char name[30];
    int age;
};

// 정의된 구조체에 대한 typedef 선언
typedef struct person PERSON;

int main(void) 
{
    POINT position = { 30, 60 };
    PERSON saram = {"강사람", 10};
    printf("%d %d\n", position.x, position.y);
    printf("%s %d\n", saram.name, saram.age);
    
    return 0;
}