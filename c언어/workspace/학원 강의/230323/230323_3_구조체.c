#define _CRT_SECURE_NO_WARNINGS

#include<stdio.h>
#include<string.h>


struct person
{
	char name[30];
	int age;
};

void main() {

	struct person boy[3] =
	{
		{ "��ҳ�", 12 },
		{ "���ҳ�", 14 },
		{ "û�ҳ�", 16 }
	};
	struct person girl[3];

	strcpy(girl[0].name, "�̼ҳ�");
	strcpy(girl[1].name, "���ҳ�");
	strcpy(girl[2].name, "�ϼҳ�");
	girl[0].age = 9;
	girl[1].age = 13;
	girl[2].age = 7;

	for (int i = 0; i < 3; i++) {
		printf("�ҳ��� �̸��� %s, ���̴� %d��\n", boy[i].name, boy[i].age);
		printf("�ҳ��� �̸��� %s, ���̴� %d��\n", girl[i].name, girl[i].age);
	}
}