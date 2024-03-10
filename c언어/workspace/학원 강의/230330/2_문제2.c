#include<stdio.h>
#include<stdlib.h>
void main() {
	int* ptr1 = 0;
	int* ptr2 = 0;
	ptr1 = (int*)calloc(10, sizeof(int));
	ptr2 = (int*)calloc(10, sizeof(int));

	scanf_s("%d %d", ptr1, ptr2);
	printf("%d", *ptr1 + *ptr2);
	
}