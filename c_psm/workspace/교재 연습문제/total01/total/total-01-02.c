#include<stdio.h>
void main() {

	int decimal = 0, choice = 1;

	printf("10���� ���� �Է� : ");
	scanf_s("%d", &decimal);

	printf("�� ������ ����ұ��? 8������ 1 �Է�, 16������ 2 �Է� : ");
	scanf_s("%d", &choice);

	choice==1 ? printf("��� : %o", decimal) : printf("��� : %x", decimal);




}