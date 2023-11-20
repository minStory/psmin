#include<stdio.h>
#include<stdlib.h>

void main() {
	int* dAr = 0;		//포인터 선언 및 초기화

	int n = 0;	//입력받을 값 선언 및 초기화
	scanf_s("%d", &n);		//값 입력 받기

	dAr = (int*)malloc(sizeof(int) * n);	//n만큼 동적할당 하겠다
	dAr = (int*)calloc(n, sizeof(int));		//포인터 초기화한 후 n만큼 동적할당 하겠다
	dAr = (int*)realloc(dAr, sizeof(int) * 8);	//n만큼 할당한 값을 8만큼으로 변경하겠다


	printf("%d\n", dAr[4]);	//4번째 방의 값을 보여줘
	printf("%d\n\n", dAr[5]);	//5번째 방의 값을 보여줘

	for (int i = 0; i < 8; i++) {	//8번 반복
		dAr[i] = i + 1;	//각 방의 값 대입
		printf("%d ", dAr[i]);	//각 방에 대입한 값을 반복 횟수만큼 보여줘
	}

	free(dAr);	//동적메모리 해제

}