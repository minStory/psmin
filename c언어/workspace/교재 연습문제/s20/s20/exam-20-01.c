#include<stdio.h>

typedef struct
{
	char name[30];
	int age;
}Person;

void main() {
	Person boy = { "È£³¯µÎ",35 };
	Person* ptr = &boy;

	printf("%s (%d)\n", (*ptr).name, (*ptr).age);
	printf("%s (%d)\n", ptr->name, ptr->age);

}