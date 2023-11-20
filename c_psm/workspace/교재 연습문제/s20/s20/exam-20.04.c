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
		{"지금 하지 않으면 언제 하겠는가",2018},
		{"타이탄의 도구들",2017},
		{"12가지 인생의 법칙",2018}
		}
	};

	for (int i = 0; i < 3; i++) {
		printf("책 제목 : %s\n출간년도 : %d년\n", myBag.books[i].title, myBag.books[i].published);
	}
}