#include<stdio.h>

void main() {
	
	int age, height, result;

	printf("���̸� �Է��ϼ��� : ");
	scanf_s("%d", &age);

	printf("Ű�� �Է��ϼ��� : ");
	scanf_s("%d", & height);

	result = age >= 12 && height >= 120 ? "���̱ⱸ�� ž���� �� �ֽ��ϴ�!" : "���̱ⱸ�� ž���� �� �����ϴ�!";

	printf("%s\n", result);


	
	if (age >= 12&&height>120) {
		printf("���̱ⱸ�� ž���� �� �ֽ��ϴ�!");
	}
	else
	{printf("���̱ⱸ�� ž���� �� �����ϴ�!");

	}

	
	return 0;

}