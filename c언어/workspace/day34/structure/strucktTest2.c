#include<stdio.h>
#include<stdlib.h>

#define L 3

typedef struct Fruit {
	char name[200];
	int price;
	char season[200];
}F;

void main() {
	F* fruits = 0;
	int size = 0;
	printf("�Է��Ͻ� ������ ������ �Է��ϼ���\n");
	scanf_s("%d", &size);

	fruits = (F*)calloc(size, sizeof(F));

	for (int i = 0; i < size; i++) {
		printf("%d��° ���ϸ� : ",i+1);
		scanf_s("%s", fruits->name,sizeof(fruits->name));
		printf("%s ���� : ", fruits->name);
		scanf_s("%d", &fruits[i].price);
		printf("%s ���� : ", fruits->name);
		scanf_s("%s", fruits->season, sizeof(fruits->season));

		printf("%s, %d, %s\n", fruits->name, fruits[i].price, fruits->season);
	}


	//F fruits[L] = {
	//	{"���",1500,"����"},
	//	{"��",3500,"�ܿ�"},
	//	{"�ٳ���",500,"����"},
	//};

	//for (int i = 0; i < L; i++) {
	//	printf("%s, %d, %s\n", fruits[i].name, fruits[i].price, fruits[i].season);
	//}

	//F apple = { "���",1500,"����" };
	//F pear = { "��",3500,"�ܿ�" };
	//F banana = { "�ٳ���",500,"����" };

	//printf("%s, %d, %s\n", apple.name, apple.price, apple.season);
	//printf("%s, %d, %s\n", pear.name, pear.price, pear.season);
	//printf("%s, %d, %s\n", banana.name, banana.price, banana.season);

}