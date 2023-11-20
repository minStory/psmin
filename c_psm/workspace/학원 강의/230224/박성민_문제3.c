#include<stdio.h>
void main() {

	int count = 0;

	scanf_s("%d", &count);

	for (int i = 0; i < count; i++) {
		for (int j = count; j>i;j-- ) {
			printf(" ");
		}
		for (int k = 0; k <= i; k++) {
			printf("*");
		}
		printf("\n");
	}
}