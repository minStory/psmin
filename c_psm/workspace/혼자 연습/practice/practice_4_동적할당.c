#include<stdio.h>
#include<stdlib.h>

void main() {
	int* dAr = 0;		//������ ���� �� �ʱ�ȭ

	int n = 0;	//�Է¹��� �� ���� �� �ʱ�ȭ
	scanf_s("%d", &n);		//�� �Է� �ޱ�

	dAr = (int*)malloc(sizeof(int) * n);	//n��ŭ �����Ҵ� �ϰڴ�
	dAr = (int*)calloc(n, sizeof(int));		//������ �ʱ�ȭ�� �� n��ŭ �����Ҵ� �ϰڴ�
	dAr = (int*)realloc(dAr, sizeof(int) * 8);	//n��ŭ �Ҵ��� ���� 8��ŭ���� �����ϰڴ�


	printf("%d\n", dAr[4]);	//4��° ���� ���� ������
	printf("%d\n\n", dAr[5]);	//5��° ���� ���� ������

	for (int i = 0; i < 8; i++) {	//8�� �ݺ�
		dAr[i] = i + 1;	//�� ���� �� ����
		printf("%d ", dAr[i]);	//�� �濡 ������ ���� �ݺ� Ƚ����ŭ ������
	}

	free(dAr);	//�����޸� ����

}