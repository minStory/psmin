#include<stdio.h>
void main() {

	int a = 0, b = 0, c = 0; // �ֻ��� 3�� �ʱ�ȭ
	int price = 0;
	int max = 0;


	printf("�ֻ��� 3�� �Է� : ");
	scanf_s("%d %d %d", &a, &b, &c); // �Է�

	if (a == b == c) {
		price = 10000 + a * 1000;
	}
	else if (a == b || b == c) {
		price = 1000 + a * 100;
	}
	else if (b == c) {
		price = 1000 + b * 100;
	}
	else {
		if (a > b && a > c)
		{
			max = a;
		}
	
		else if (b > a && b > c)
		{
			max = b;
		}
		else if (c > a && c > b)
		{
			max = c;
		}
		}



}