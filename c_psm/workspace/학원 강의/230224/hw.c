#include<stdio.h>
void main() {

	int T = 0,num=0;

	printf("�ݺ� Ƚ�� : ");
	scanf_s("%d", &T);

	while (num < T) {
		int a = 0, b = 0;
		printf("���� 2�� �Է� :");
		scanf_s("%d %d", &a, &b);
		printf("�� ������ ���� %d�Դϴ�.\n", a + b);
		num++;
	}

	}