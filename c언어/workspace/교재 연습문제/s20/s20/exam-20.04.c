#include<stdio.h>
typedef struct
{
	char title[100];
	int published;
}Book;

typedef struct
{
	Book books[3];
}Bag;

void main() {
	Bag myBag = {
		{
		{"���� ���� ������ ���� �ϰڴ°�",2018},
		{"Ÿ��ź�� ������",2017},
		{"12���� �λ��� ��Ģ",2018}
		}
	};

	for (int i = 0; i < 3; i++) {
		printf("å ���� : %s\n�Ⱓ�⵵ : %d��\n", myBag.books[i].title, myBag.books[i].published);
	}
}