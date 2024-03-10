#include<stdio.h>
#include<string.h>
int strcpy_custom(int* A, int* B) {
	

	*A = *B;
	printf("함수 호출 중 A의 값 : %s\n", A);

}5
void main() {

	char A[30] = { 0, };
	char B[30] = { 0, };
	555
	printf("A의 값 : ");
	scanf_s("%s", A, sizeof(A));
	printf("B의 값 : ");
	scanf_s("%s", B, sizeof(B));



	printf("A의 값 : %s, B의 값 : %s\n", A, B);
	printf("함수 호출 전 A의 값 : %s\n", A);
	strcpy_custom(A, B,30);
	printf("함수 호출 후 A의 값 : %s\n", A);


}