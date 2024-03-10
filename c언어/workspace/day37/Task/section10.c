#include<stdio.h>
void main() {

	//1번
	//	int a = 10;
	//	int* p = &a;
	//	*p = 20;
	//	printf("%d\n", a);
	//	*p = 50;
	//	printf("%d\n", a);
	//}

	//2번
	//int number = 10;
	//int* pnumber = &number;

	//printf("%d\n", *pnumber);
	//printf("%p\n", pnumber);

	//3번
	//int* ptr;
	//int num1 = 5;
	//int num2 = 8;

	//ptr = &num1;
	//printf("%d\n", *ptr);

	//ptr = &num2;
	//printf("%d\n", *ptr);

	//4번
	int n1 = 100, n2 = 200;
	int* ptr1 = &n1;
	int* ptr2 = &n2;

	printf("%d %d\n", *ptr1, *ptr2);

	int temp = 0;

	temp = *ptr1;
	*ptr1 = *ptr2;
	*ptr2 = temp;

	printf("%d %d\n", *ptr1, *ptr2);

}