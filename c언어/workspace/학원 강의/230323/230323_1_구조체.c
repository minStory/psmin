#include<stdio.h>
#include<string.h>
struct person
{
	char name[30];
	int age;
};


void main() {
	struct person boy, girl;

	strcpy_s(boy.name,sizeof(boy),"김소년");
	strcpy_s(girl.name,sizeof(girl),"이소녀");

	boy.age = 12;
	girl.age = 9;
	printf("소년의 이름은 %s, 나이는 %d세\n", boy.name, boy.age);
	printf("소녀의 이름은 %s, 나이는 %d세\n", girl.name, girl.age);

}