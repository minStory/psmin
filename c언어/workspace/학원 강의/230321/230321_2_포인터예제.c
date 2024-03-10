#include<stdio.h>
void main() {
	//int number = 10;
	//int* pnumber = &number;

	//printf("%d\n%p", *pnumber, &pnumber);

	//int* ptr;
	//int num1 = 5;
	//int num2 = 8;

	//ptr = &num1;
	//printf("%d\n", *ptr);

	//ptr = &num2;
	//printf("%d\n", *ptr);

	int n1 = 100, n2 = 200;
	int* ptr1 = &n1;
	int* ptr2 = &n2;

	printf("%d %d\n", *ptr1, *ptr2);

	ptr1 = &n2;
	ptr2 = &n1;

	printf("%d %d\n", *ptr1, *ptr2);
    }



