#include<stdio.h>
typedef struct Worker
{
	char name[30];
	char num[30];
	int salary;
}W;
void main() {
	W* emp = 0 ;

	emp = (int*)calloc(3, sizeof(int));

	printf("������ �̸� : ");
	scanf_s("%s", emp->name, sizeof(emp->name));
	printf("������ ��ȭ��ȣ : ");
	scanf_s("%s", emp->num, sizeof(emp->name));
	printf("������ ���޿� : ");
	scanf_s("%d", &emp->salary);

	printf("\n");

	printf("������ �̸� : %s\n", emp->name);
	printf("������ ��ȭ��ȣ : %s\n", emp->num);
	printf("������ ���޿� : %d\n", emp->salary);


}