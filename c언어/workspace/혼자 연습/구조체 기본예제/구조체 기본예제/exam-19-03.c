#include<stdio.h>
#include<string.h>

#define L 3

struct person {
	char name[30];
	int age;
};


void main() {

	struct person boy[L] = {
		{"��ҳ�",12},
		{"���ҳ�",14},
		{"û�ҳ�",16}
	};

	struct person girl[L] = { 0 };
	
	strcpy_s(girl[0].name, sizeof(girl[0].name), "�̼ҳ�");
	strcpy_s(girl[1].name, sizeof(girl[1].name), "���ҳ�");
	strcpy_s(girl[2].name, sizeof(girl[2].name), "�ϼҳ�");
	girl[0].age = 9;
	girl[1].age = 13;
	girl[2].age = 7;

	for (int i = 0; i < L; i++) {
		printf("�ҳ��� �̸��� %s, ���̴� %d��\n", boy[i].name, boy[i].age);
		printf("�ҳ��� �̸��� %s, ���̴� %d��\n", girl[i].name, girl[i].age);
	}


}
