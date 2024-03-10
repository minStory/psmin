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

	printf("직원의 이름 : ");
	scanf_s("%s", emp->name, sizeof(emp->name));
	printf("직원의 전화번호 : ");
	scanf_s("%s", emp->num, sizeof(emp->name));
	printf("직원의 월급여 : ");
	scanf_s("%d", &emp->salary);

	printf("\n");

	printf("직원의 이름 : %s\n", emp->name);
	printf("직원의 전화번호 : %s\n", emp->num);
	printf("직원의 월급여 : %d\n", emp->salary);


}