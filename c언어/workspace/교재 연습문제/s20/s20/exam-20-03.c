#include<stdio.h>
typedef struct
{
	char title[100];
	int published;
}Book;

typedef struct
{
	Book book;
}Bag;

void main() {
	Bag myBag={
		{"���� ���� ������ ���� �ϰڴ°�",2018}
	};
	printf("å ���� : %s \n�Ⱓ�⵵ : %d��\n", myBag.book.title, myBag.book.published);

}