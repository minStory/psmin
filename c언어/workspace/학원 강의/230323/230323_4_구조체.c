#include<stdio.h>
#include<string.h>
struct employee {
	char name[30];
	char pid[30];
	int salary;
};

void main() {
	struct employee* emp = 0;
	int n = 0;

	scanf_s("%d", &n);
	emp = (struct employee*)calloc(n, sizeof(struct employee));

	for (int i = 0; i < n; i++) {
		printf("�̸� : ");
		scanf_s("%s", emp[i].name, sizeof(emp->name));
		printf("�ֹ� : ");
		scanf_s("%s", emp[i].pid, sizeof(emp->name));
		printf("�޿� : ");
		scanf_s("%d", &emp[i].salary);
	}

	printf("\n");
	for (int i = 0; i < n; i++) {
		printf("�̸� : %s\n", emp[i].name);
		printf("�ֹ� : %s\n", emp[i].pid);
		printf("�޿� : %d\n", emp[i].salary);
	}

	//printf("�̸� :");
	//scanf_s("%s", emp.name,sizeof(emp));
	//printf("�ֹ� :");
	//scanf_s("%s", emp.pid,sizeof(emp));
	//printf("�޿� : ");
	//scanf_s("%d", &emp.salary);

	//	printf("�̸� : %s\n", emp.name);
	//	printf("�ֹ� : %s\n", emp.pid);
	//	printf("�޿� : %d\n", emp.salary);
}
