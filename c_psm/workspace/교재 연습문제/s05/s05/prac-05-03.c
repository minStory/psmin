#include<stdio.h>
void main() {

	float a = 0, b = 0, c = 0, d = 0, e = 0;

	printf("���� ���� : ");
	scanf_s("%f", &a);
	printf("���� ���� : ");
	scanf_s("%f", &b);
	printf("���� ���� : ");
	scanf_s("%f", &c);
	printf("��ȸ ���� : ");
	scanf_s("%f", &d);
	printf("���� ���� : ");
	scanf_s("%f", &e);

	printf("��������� %.2f ���Դϴ�.",(a+b+c+d+e)/5);



}