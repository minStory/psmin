#include<stdio.h>
#include<string.h>

struct Animal {
	char name[200];
	int age;
	char feed[200];
};

void main() {
	//struct Animal dog = { "Max",10,"����" };
	struct Animal dog = { 0, };

	strcpy_s(dog.name, sizeof(dog.name), "Max");
	dog.age = 20;
	strcpy_s(dog.feed, sizeof(dog.feed), "����");
	
	printf("%s, %d, %s", dog.name, dog.age, dog.feed);
}

