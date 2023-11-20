#include<stdio.h>
void main() {

	//1번
	//int arr[5] = { 10,20,30,40,50 };
	//int* ptr = &arr[0];

	//for (int i = 0; i < 5; i++) {
	//	printf("%d ", *(ptr + i));
	//}

	//2번
	//int arr[8] = { 1,2,3,4,5,6,7,8 };
	//int* ptr = &arr[7];
	//int temp = 0;

	//for (int i = 0; i < 8; i++) {
	//	printf("%d ", *(ptr + i));
	//}

	//for (int i = 0; i < 8; i++) {
	//	if (*(ptr - i) % 2) { temp += *(ptr - i); }
	//}
	//printf("배열 요소 중 홀수의 총합은 : %d\n", temp);

	//3번
	int arr[8] = { 1,2,3,4,5,6,7,8 };
	int* ptr1 = &arr[0];
	int* ptr2 = &arr[7];
	int temp = 0;

	//for (int i = 0; i < 8; i++) {
	//	printf("%d ", *(ptr1+i));
	//}
	//printf("\n");
	//for (int i = 0; i < 8; i++) {
	//	printf("%d ", *(ptr2 - i));
	//}

	for (int i = 0; i < 4; i++) {
		temp = *(ptr1+i);
		*(ptr1+i) = *(ptr2-i);
		*(ptr2-i) = temp;
	}

	for (int i = 0; i < 8; i++) {
		printf("%d ", arr[i]);
	}
}