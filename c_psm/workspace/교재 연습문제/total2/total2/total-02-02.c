#include<stdio.h>
void main() {

	int a = 0, b = 0;

	printf("��ܺ��� ��ܱ���?");
	scanf_s("%d %d", &a, &b);

	if (a >= b) {

		for (; a >= b;b++) {
			printf("%d��\n", b);

			for (int j = 1; j < 10; j++) {
				printf("%d * %d = %2d ", b, j, b * j);

			}
			printf("\n");
		}
	}
	else {

		for (; a <= b; a++) {
			printf("%d��\n", a);

			for (int j = 1; j < 10; j++) {
				printf("%d * %d = %2d ", a, j, a * j);

			}
			printf("\n");
		}
	}



	}