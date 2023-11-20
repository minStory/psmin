#include<stdio.h>

void main() {

	int arr[3] = { 1,2,3 };
	printf("배열 각 요소의 주소 확인\n");
	printf("배열의 이름 : %p\n",arr);
	printf("첫번째 요소 : %p\n",&arr[0]);
	printf("두번째 요소 : %p\n",&arr[1]);
	printf("세번째 요소 : %p\n",&arr[2]);
	
	short sarr[3] = { 1,2,3 };
	int iarr[3] = { 10,20,30 };

	//인덱스번호로 접근
	printf("%d %d %d\n", sarr[0], sarr[1], sarr[2]);
	printf("%d %d %d\n", iarr[0], iarr[1], iarr[2]);
	//포인터연산으로 접근
	printf("%d %d %d\n", *sarr, *(sarr+1), *(sarr+2));
	printf("%d %d %d\n", *iarr, *(iarr+1), *(iarr+2));
	//주소 확인
	printf("%p %p %p\n", &sarr[0], &sarr[1], &sarr[2]);
	printf("%p %p %p\n", &iarr[0], &iarr[1], &iarr[2]);

	//확인해볼것
	
	int v = 10;
	int* ptr = &v;

	v = *ptr++;
	v = (*ptr)++;
	v = *++ptr;
	v = ++ * ptr;


}