#include<stdio.h>
void main() {
	int num = 0, n = 0;

	printf("���� �Է� : ");
	scanf_s("%d", &n);


	for (int i = 1; i <= n; i++) {
		num += i;

	}

	printf("1���� %d������ ���� %d�Դϴ�.",n, num);

}