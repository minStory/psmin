#include<stdio.h>
#include<string.h>
#include<stdlib.h>
void main() {
	int arr[5] = { 10,20,30,40,50 };
	int* pa;
	int* pb;
	int* pc;
	int i;

	pa = (int*)malloc(sizeof(arr));		//4byte*[5] = 20�Ҵ�

	for (i = 0; i < 5; i++) {
		pa[i] = arr[i];
	}

	pb = (int*)calloc(pa[3], sizeof(int));	//40*4 = 160�Ҵ�
	pc = (int*)realloc(NULL, pa[4]);		//0*50 = 0�Ҵ�

	printf("%d\n%d\n%d\n", sizeof(pa), sizeof(pb), sizeof(pc));
}