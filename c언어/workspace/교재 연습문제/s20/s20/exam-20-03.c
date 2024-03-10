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
		{"지금 하지 않으면 언제 하겠는가",2018}
	};
	printf("책 제목 : %s \n출간년도 : %d년\n", myBag.book.title, myBag.book.published);

}