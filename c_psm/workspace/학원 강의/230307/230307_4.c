#include<stdio.h>
#include<stdlib.h>
void main() {
	//���� �Ҵ�
	int N = 0, ref = 0, cnt = 0; // ����, ����, ī��Ʈ
	int arData[100] = { 0, }; // �ݺ��� ����

	//���� �Ҵ�
	int n;
	int* arr;
	scanf_s("%d", &n);
	arr = (int*)malloc(sizeof(int) * n);


	scanf_s("%d", &N);

	for (int i = 0; i < N; i++) {
		scanf_s("%d", &arData[i]);
	}

	scanf_s("%d", &ref);

	for (int j = 0; j < N; j++) {
		if (arData[j] == ref) {
			cnt++;
		}

	}
	printf("%d", cnt);

}