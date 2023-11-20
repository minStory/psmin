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
		printf("이름 : ");
		scanf_s("%s", emp[i].name, sizeof(emp->name));
		printf("국어 점수 : ");
		scanf_s("%d", &emp[i].kor);
		printf("수학 점수 : ");
		scanf_s("%d", &emp[i].mat);
		printf("영어 점수 : ");
		scanf_s("%d", &emp[i].eng);
	}
	printf("\n");

	for (int i = 0; i < size; i++) {
		printf("이름 : %s\n", emp[i].name);
		printf("국어 점수 : %d\n", emp[i].kor);
		printf("수학 점수 : %d\n", emp[i].mat);
		printf("영어 점수 : %d\n", emp[i].eng);
	}

}