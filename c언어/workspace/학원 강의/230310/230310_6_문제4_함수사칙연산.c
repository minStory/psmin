//�� ���� �ڿ����� �Է¹޾� ��Ģ������ �����ϴ� ���α׷��� �ۼ��϶�.
//
//[���� ����]
//1. �� ���� �ڿ��� a, b�� 1���� 9������ �ڿ����̴�. (1 �� a, b �� 9)
//2. ��Ģ���� + , -, *, / ������ ������ ����� ����Ѵ�.
//3. ������ ������ ������� �Ҽ��� ������ ���ڴ� ������.
//
//[�Է�]
//�Է����� �� ���� �ڿ��� a, b�� �� ĭ�� �ΰ� �־�����.
//
//[���]
//��Ģ������ ����� �� �ٿ� ������� ����Ѵ�.
//
//�Է� :
//8 3
//
//��� :
//	1
//	5
//	24
//	2
#include<stdio.h>
int add(int a, int b) {
	int result = a + b;
	return result;
}
int sub(int a, int b) {
	int result = a - b;
	return result;
}
int multi(int a, int b) {
	int result = a * b;
	return result;
}
int div(int a, int b) {
	int result = a / b;
	return result;
}

void main() {
	int a = 0, b = 0;
	scanf_s("%d %d", &a, &b);

	printf("%d\n%d\n%d\n%d", add(a, b), sub(a, b), multi(a, b), div(a, b));






}