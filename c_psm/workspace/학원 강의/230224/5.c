#include<stdio.h>
void main() {

	int num = 0; //�ʱ�ȭ


	printf("���� �Է� : "); //�Է�ǥ��
	scanf_s("%d", &num); //�ݺ� Ƚ�� �Է�

	for (int i = 0; i > num; i--) { 
		for (int j = 0; j < i; j++) {
			printf("\n");

		}
		printf("*");
	}




}