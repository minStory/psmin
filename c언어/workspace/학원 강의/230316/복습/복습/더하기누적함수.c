#include<stdio.h>
int addSum(int a) {
	int sum = 0;	//���� ���� ������ ���� ����
	for (int i = 0; i <= a; i++) {	//i�� a���� sum�� ��� �ݺ�
		sum += i;
	}
	return sum;	//sum�� ������ ������ ���̴�.
}


void main() {
	int a = 0;
	scanf_s("%d", &a);
	printf("%d", addSum(a)); //�Լ��� a�� �����Ų ���� �ҷ��´�.
}