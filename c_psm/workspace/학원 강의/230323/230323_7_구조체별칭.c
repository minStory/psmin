#include<stdio.h>
#include<string.h>

typedef struct Score
{
	char name[30];
	int kor;
	int mat;
	int eng;
}S;

void main() {

	S* emp = 0;
	int size = 0;

	scanf_s("%d", &size);
	emp = (S*)calloc(size, sizeof(S*));

	for (int i = 0; i < size; i++) {
		printf("�̸� : ");
		scanf_s("%s", emp[i].name, sizeof(emp->name));
		printf("���� ���� : ");
		scanf_s("%d", &emp[i].kor);
		printf("���� ���� : ");
		scanf_s("%d", &emp[i].mat);
		printf("���� ���� : ");
		scanf_s("%d", &emp[i].eng);
	}
	printf("\n");

	for (int i = 0; i < size; i++) {
		printf("�̸� : %s\n", emp[i].name);
		printf("���� ���� : %d\n", emp[i].kor);
		printf("���� ���� : %d\n", emp[i].mat);
		printf("���� ���� : %d\n", emp[i].eng);
	}

}