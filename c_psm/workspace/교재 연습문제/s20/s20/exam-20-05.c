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
	printf("�й� : %d, ���� : %d\n", s.s_id, s.age);
}

void main() {

	Student s = setStudent(20201212, 10);
	printfStudent(s);	//�� �Ͻ��� ���� (Call-by-Value)
}