#include<stdio.h>
void main() {//�Ǻ���ġ ����

	int before = 1, between = 1, next =1 ,n=0;	//������, ���簪, ������, ���� ����
	printf("�Ǻ���ġ ���� ��� ���� : ");
	scanf_s("%d", &n);

	for (int i = 0; i < n; i++) {	//������ŭ �ݺ�
		printf("%d ", between);	//���簪�� ���
		before=between;	//�������� ���簪���� ����
		between = next;	//���簪�� ���������� ����
		next = before + between; //�������� ������+���簪���� ����
	}
}