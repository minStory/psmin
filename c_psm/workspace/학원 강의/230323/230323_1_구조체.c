#include<stdio.h>
#include<string.h>
struct person
{
	char name[30];
	int age;
};


void main() {
	struct person boy, girl;

	strcpy_s(boy.name,sizeof(boy),"��ҳ�");
	strcpy_s(girl.name,sizeof(girl),"�̼ҳ�");

	boy.age = 12;
	girl.age = 9;
	printf("�ҳ��� �̸��� %s, ���̴� %d��\n", boy.name, boy.age);
	printf("�ҳ��� �̸��� %s, ���̴� %d��\n", girl.name, girl.age);

}