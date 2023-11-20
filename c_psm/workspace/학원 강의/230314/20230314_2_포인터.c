#include<stdio.h>
void main() {

	//1
	//char cnum = 5;
	//int inum = 999;
	//double dnum = 3.14;

	//char* cptr = &cnum;
	//int* iptr = &inum;
	//double* dptr = &dnum;

	//printf("%p\n", &cnum);
	//printf("%p\n", iptr);
	//printf("%p\n", dptr);


	//2
	//int num1 = 100, num2 = 100;
	//int* pnum = 0;

	//pnum = &num1;
	//(*pnum) += 30;
	//pnum = &num2;
	//(*pnum) -= 30;

	//printf("%d %d", num1, num2);


	//3
	//int num1 = 10, num2 = 20;
	//int* ptr1 = &num1;
	//int* ptr2 = &num2;
	//int* temp;
	//*ptr1 += 10;
	//*ptr2 -= 10;
	//temp = ptr1;
	//ptr1 = ptr2;
	//ptr2 = temp;

	//printf("%d %d", *ptr1, *ptr2);

	//4
	int num = 10;
	int* pnum;
	pnum = &num;

	*pnum = 20;
	printf("num : %d\n", num);
	(*pnum)++; (*pnum)++;
	printf("num : %d\n", num);
	printf("*pnum : %d\n", *pnum);








}