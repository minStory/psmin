#include<stdio.h>

typedef struct
{
	int s_id;
	int age;
}Student;

Student setStudent(int s_id, int age) 
{
	Student s = { s_id,age };

	return s;
}
void printfStudent(Student s)
{
	printf("학번 : %d, 나이 : %d\n", s.s_id, s.age);
}

void main() {

	Student s = setStudent(20201212, 10);
	printfStudent(s);	//값 일시적 변경 (Call-by-Value)
}