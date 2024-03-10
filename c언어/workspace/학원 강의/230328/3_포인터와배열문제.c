#include<stdio.h>
void main() {

//	int arr[5] = { 1,2,3,4,5 };
//	int* ptr = &arr;
//
//	for (int i = 0; i < 5; i++) {
//		*(ptr + i) += 2;
//		printf("%d ", *ptr + i);
//	}

	int arr[6] = { 1,2,3,4,5,6 };
	int* ptr = &arr;

	for (int i = 0; i < 5; i++) {
		*ptr++ += 2;
		printf("%d ", *ptr+i);
	}
	printf("\n");

	//v=*p++ ??¼ø¼­

}