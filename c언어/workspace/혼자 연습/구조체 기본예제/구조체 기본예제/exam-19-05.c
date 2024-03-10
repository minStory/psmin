#include<stdio.h>

typedef struct {
	int x;
	int y;
	int z;
}POINT;

//struct person {
//	char name[30];
//	int age;
//};

typedef struct {
	char name[30];
	int age;
}PERSON;

	//typedef struct person PERSON;

	void main() {

		POINT position = { 30,60,90 };
		PERSON saram = { "°­»ç¶÷",10 };
		printf("%d %d %d\n", position.x, position.y,position.z);
		printf("%s %d\n", saram.name, saram.age);

	}

