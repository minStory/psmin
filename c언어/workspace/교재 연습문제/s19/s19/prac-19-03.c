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
		printf("직원%d의 이름 : ", i + 1);
		scanf_s("%s", emp[i].name, sizeof(emp[i].name));
		printf("직원%d의 전화번호 : ", i + 1);
		scanf_s("%s", emp[i].num, sizeof(emp[i].num));
		printf("직원 %d의 월급여 : ", i + 1);
		scanf_s("%d", &emp[i].salary);
	}
	printf("\n");
	for (int i = 0; i < 3; i++) {
		printf("직원%d의 이름 : %s\n", i + 1, emp[i].name);
		printf("직원%d의 전화번호 : %s\n", i + 1, emp[i].num);
		printf("직원%d의 월급여 : %d\n", i + 1, emp[i].salary);
		}

}