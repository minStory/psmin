#include<stdio.h>
void swap(int* a, int* b) {
	int* temp = 0;

	temp = *a;
	*a = *b;
	*b = temp;

}

void main() {

	int num1 = 10, num2 = 20;


	printf("num1�� ���� : %d\n", num1);
	printf("num1�� ���� : %d\n", num2);

	swap(&num1, &num2);

	printf("%d %d", num1, num2);


	//����

	//������ ��� �� ������
	
	//������ ���� ���� �� �ʱ�ȭ �ϱ�

	//NULL������ ����ϱ�

	//������ �ڷ����� ������ �ڷ��� ��ġ

	//���� �ּ� ��� ���� �ʱ�




}
