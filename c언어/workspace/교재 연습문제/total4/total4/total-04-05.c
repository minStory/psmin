#include<stdio.h>
void main() {
	asc();
	desc();
}
int asc() {
	int arr[5] = { 0, };
	
	for (int i = 0; i < 5; i++) {
		printf("�迭 ��� %d �Է� : ", i + 1);
		scanf_s("%d", arr + i);
	}
	int temp = 0;
	for (int i = 0; i < 4; i++) {
		for (int j = i + 1; j < 5; j++) {
			if (arr[i] > arr[j]) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
	}
	printf("==�������� ���� �Լ� ȣ��!==\n");
	for (int i = 0; i < 5; i++) {
		printf("%d ", *(arr + i));
	}
	printf("\n");
}
int desc() {
	int arr[5] = { 0, };

	for (int i = 0; i < 5; i++) {
		printf("�迭 ��� %d �Է� : ", i + 1);
		scanf_s("%d", arr + i);
	}
	int temp = 0;
	for (int i = 0; i < 4; i++) {
		for (int j = i + 1; j < 5; j++) {
			if (arr[i] < arr[j]) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
	}
	printf("==�������� ���� �Լ� ȣ��!==\n");
	for (int i = 0; i < 5; i++) {
		printf("%d ", *(arr + i));
	}
	printf("\n");
}