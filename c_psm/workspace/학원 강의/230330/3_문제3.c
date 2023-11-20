#include<stdio.h>
void main() {
	int arr[5] = { 0, };
	int* ptr = arr;

	for (int i = 0; i < 5; i++) {
		scanf_s("%d", ptr + i);
		i % 2 ? 0 : printf("%d\n", *(ptr + i));
	}
}