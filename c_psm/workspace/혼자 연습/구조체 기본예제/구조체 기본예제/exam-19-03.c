#include<stdio.h>
#include<string.h>

#define L 3

struct person {
	char name[30];
	int age;
};


void main() {

	struct person boy[L] = {
		{"김소년",12},
		{"유소년",14},
		{"청소년",16}
	};

	struct person girl[L] = { 0 };
	
	strcpy_s(girl[0].name, sizeof(girl[0].name), "이소녀");
	strcpy_s(girl[1].name, sizeof(girl[1].name), "오소녀");
	strcpy_s(girl[2].name, sizeof(girl[2].name), "하소녀");
	girl[0].age = 9;
	girl[1].age = 13;
	girl[2].age = 7;

	for (int i = 0; i < L; i++) {
		printf("소년의 이름은 %s, 나이는 %d세\n", boy[i].name, boy[i].age);
		printf("소녀의 이름은 %s, 나이는 %d세\n", girl[i].name, girl[i].age);
	}


}
