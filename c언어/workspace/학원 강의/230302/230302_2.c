#include<stdio.h>

int add(int a, int b) {
	return a + b;
}
int minus(int a, int b) {
	return a - b;
}
int multi(int a, int b) {
	return a * b;
}
int div(int a, int b) {
	return a / b;
}
void main() {

	int choice = 0;
	int x = 0, y = 0;

	printf("���ϴ� �޴��� �����ϼ���.\n1. ����\n2. ����\n3. ����\n4. ������\n");
	scanf_s("%d", &choice);
	printf("�ΰ��� ���� �Է��ϼ���.\n");
	scanf_s("%d %d", &x, &y);

	switch (choice) {
	case 1:
		printf("%d", add(x, y));
		break;
	case 2:
		printf("%d", minus(x, y));
		break;
	case 3:
		printf("%d", multi(x, y));
		break;
	case 4:
		printf("%d", div(x, y));
		break;
	default:
		printf("�߸� �Է��ϼ̽��ϴ�.");
		break;
	}
}

//	printf("%d",div(3, 5));
//
//
//
//
//
//	int x = 1, total = 1;
//
//	printf("���� �Է� : ");
//	scanf_s("%d", &x);
//
//	for (int i = 1; i <= x; i++) {
//		total *= i;
//	}
//	printf("%d! = %d",x, total);
//}
//
//
//
//
//
//
//
//
//
//
