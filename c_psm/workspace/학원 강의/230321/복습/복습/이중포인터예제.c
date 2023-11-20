#include<stdio.h>
void main() {
	int num = 3 , num2 = 5;
	int* ptr1 = &num;
	int** dptr = &ptr1;
	int* ptr2=&num2;

	printf("%p %p\n", ptr1, dptr);
	printf("%d %d\n", num, **dptr);
	
	*dptr = ptr2;
	printf("%d %d\n", num, **dptr);

	printf("%d\n", *ptr1);
	printf("%d\n", num);
	printf("%d\n", **dptr);
	printf("%d\n", *ptr2);


}