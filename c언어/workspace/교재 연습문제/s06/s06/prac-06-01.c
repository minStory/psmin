#include<stdio.h>
void main() {

	int a = 0, b = 1250, c = 800;

	printf("���̸� �Է��ϼ��� : ");
	scanf_s("%d", &a);

	//a >= 20 ? printf("����� ���̴� %d���̸�, ����� %d���Դϴ�!", a, b) : printf("����� ���̴� %d���̸�, ����� %d���Դϴ�!", a, c);

	printf("����� ���̴� %d���̸�, ����� %d���Դϴ�!", a, a >= 20 ? b : c);

	return 0;

}