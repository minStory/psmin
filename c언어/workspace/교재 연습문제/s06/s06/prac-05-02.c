#include<stdio.h>
void main() {
	int age = 0, height = 0;

	printf("���̸� �Է��ϼ��� : ");
	scanf_s("%d", &age);
	printf("Ű�� �Է��ϼ��� : ");
	scanf_s("%d", &height);

	age >= 12 && height >= 120 ? printf("���̱ⱸ�� ž���� �� �ֽ��ϴ�!") : printf("���̱ⱸ�� ž���� �� �����ϴ�!");

}