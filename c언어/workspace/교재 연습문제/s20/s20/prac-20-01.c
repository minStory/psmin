#include<stdio.h>
typedef struct
{
	char name[30];
	int age;
	double height;
}PERSON;

void main() {
	PERSON person = { "�տ���",30,180.35 };
	PERSON* ptr = &person;							//�����ͺ��� ptr �����ϰ� person�� �ּҰ����� �ʱ�ȭ

	printf("�̸� : %s\n���� : %d\n���� : %.2lf", ptr[0].name, ptr->age, person.height);	//�迭����, ����������, �������� ��� ����

}