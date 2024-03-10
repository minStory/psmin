#include<stdio.h>
void main() {

	int A = 10, B = 20, temp = 0;

	temp = A;
	A = B;
	B = temp;

	printf("%d %d", A, B);
}