#include<stdio.h>
#include<string.h>
int strcpy_custom(int* A, int* B) {
	

	*A = *B;
	printf("�Լ� ȣ�� �� A�� �� : %s\n", A);

}5
void main() {

	char A[30] = { 0, };
	char B[30] = { 0, };
	555
	printf("A�� �� : ");
	scanf_s("%s", A, sizeof(A));
	printf("B�� �� : ");
	scanf_s("%s", B, sizeof(B));



	printf("A�� �� : %s, B�� �� : %s\n", A, B);
	printf("�Լ� ȣ�� �� A�� �� : %s\n", A);
	strcpy_custom(A, B,30);
	printf("�Լ� ȣ�� �� A�� �� : %s\n", A);


}