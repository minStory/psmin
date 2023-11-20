#include <stdio.h>

typedef struct
{
    char name[30]; // 이름
    int age; // 나이
    double height; // 신장 
}PERSON;

int main(void)
{
    PERSON person = {"손오공", 30, 180.35}; 
    PERSON *ptr = &person;
    
    printf("이름 : %s\n나이 : %d\n신장 : %0.2f\n", ptr->name, ptr->age, ptr-> height);

    return 0;
}