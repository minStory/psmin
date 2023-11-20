#include<stdio.h>

typedef int INT;
typedef int* PINT;
typedef unsigned int UINT;

void main() {
	typedef char CHAR;
	typedef char* STR;

	INT num = 3;
	PINT ptr = &num;
	UINT unum = 5;

	CHAR ch = 'c';
	STR str = "Hello!";

	printf("%d %d %d\n", num, *ptr, unum);
	printf("%c %s\n", ch, str);

}