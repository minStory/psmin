//������ ���� �� ���� �̿��Ͽ� �� ���� �Է� �ް� ��Ģ ������ �����ϴ� ���α׷� �����

#include<stdio.h>
#include<stdlib.h>
void main() {
	int* a = 0;
	int* b = 0;
	a = (int*)calloc(10, sizeof(int));
	b = (int*)calloc(10, sizeof(int));
	scanf_s("%d %d", a, b);

	printf("%d + %d = %d\n", *a,*b,*a + *b);
	printf("%d - %d = %d\n", *a,*b,*a - *b);
	printf("%d * %d = %d\n", *a,*b,*a * *b);
	printf("%d / %d = %d\n", *a,*b,*a / *b);
	printf("%d %% %d = %d\n", *a,*b,*a % *b);
}