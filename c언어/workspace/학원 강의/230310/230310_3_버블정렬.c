#include<stdio.h>
#define MAX_SIZE 5

void bubble_sort(int list[], int n) {
	int i, j, temp;

	for (i = n - 1; i > 0; i--) { //0~(i-1)���� �ݺ�
		for (j = 0; j < i; j++) { //j��°�� j+1��°�� ��Ұ� ũ�� ���� �ƴϸ� ��ȯ
			if (list[j] < list[j + 1]) {
				temp = list[i];
				list[i] = list[j];
				list[j] = temp;
			}
		}

	}
}
void main() {

	int i;
	int n = 5;
	int list[5] = { 7, 4, 5, 1, 3 };

	//���� ����
	bubble_sort(list, n);

	//��� ���
	for (int i = 0; i < n; i++) {
		printf("%d\n", list[i]);

	}
}