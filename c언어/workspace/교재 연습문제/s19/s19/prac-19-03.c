#include<stdio.h>
#include<string.h>
typedef struct worker
{
	char name[30];
	char num[30];
	int salary;
}WORKER;
void main() {
	WORKER* emp = 0 ;

	emp = (int*)calloc(3, sizeof(int));

	for (int i = 0; i < 3; i++) {
		printf("����%d�� �̸� : ", i + 1);
		scanf_s("%s", emp[i].name, sizeof(emp[i].name));
		printf("����%d�� ��ȭ��ȣ : ", i + 1);
		scanf_s("%s", emp[i].num, sizeof(emp[i].num));
		printf("���� %d�� ���޿� : ", i + 1);
		scanf_s("%d", &emp[i].salary);
	}
	printf("\n");
	for (int i = 0; i < 3; i++) {
		printf("����%d�� �̸� : %s\n", i + 1, emp[i].name);
		printf("����%d�� ��ȭ��ȣ : %s\n", i + 1, emp[i].num);
		printf("����%d�� ���޿� : %d\n", i + 1, emp[i].salary);
		}

}