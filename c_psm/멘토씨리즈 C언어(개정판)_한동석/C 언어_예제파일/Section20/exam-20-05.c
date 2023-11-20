#include <stdio.h>

typedef struct 
{
    int s_id;
    int age;
}Student;

// 선언 및 초기화를 마친 구조체 변수를 반환하는 함수
Student setStudent(int s_id, int age)
{
    Student s = {s_id, age};

    return s;
}

// 구조체를 전달받아 멤버 변수를 출력하는 함수 
void printStudent(Student s)
{
    printf("학번 : %d, 나이 : %d\n", s.s_id, s.age);
}

int main(void)
{
    Student s = setStudent(20201212, 10); // 반환된 구조체 변수를 대입 
    printStudent(s); // 구조체 변수를 인자로 전달 
    
    return 0;
}