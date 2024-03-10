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
		printf("이름 : ");
		scanf_s("%s", emp[i].name, sizeof(emp->name));
		printf("주민 : ");
		scanf_s("%s", emp[i].pid, sizeof(emp->name));
		printf("급여 : ");
		scanf_s("%d", &emp[i].salary);
	}

	printf("\n");
	for (int i = 0; i < n; i++) {
		printf("이름 : %s\n", emp[i].name);
		printf("주민 : %s\n", emp[i].pid);
		printf("급여 : %d\n", emp[i].salary);
	}

	//printf("이름 :");
	//scanf_s("%s", emp.name,sizeof(emp));
	//printf("주민 :");
	//scanf_s("%s", emp.pid,sizeof(emp));
	//printf("급여 : ");
	//scanf_s("%d", &emp.salary);

	//	printf("이름 : %s\n", emp.name);
	//	printf("주민 : %s\n", emp.pid);
	//	printf("급여 : %d\n", emp.salary);
}
