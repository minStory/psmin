#include<stdio.h>
#include<stdlib.h>
void main() {

	//���� �Ҵ�
	int n;
	int* arr;
	int v;
	int cnt = 0;
	printf("���� �迭 ũ�� :");
	scanf_s("%d", &n);

	arr = (int*)malloc(sizeof(int) * n); //arr[N]

	for (int i = 0; i < n; i++) {
		scanf_s("%d", &arr[i]);
	}

	scanf_s("%d", &v);

	for (int i = 0; i < n; i++) {
		if (arr[i] == v) { cnt++; }
	}
	printf("%d", cnt);

}