//������ ������ �����ϰ� ������ ������ ����Ͽ� 100 ������ ���� �Է¹��� �� �Է¹��� ����ŭ �� * ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
#include<stdio.h>
void main() {
	int num = 0;
	int* ptr = &num;

	scanf_s("%d", ptr);

	for (int i = 0; i < *ptr; i++) {
		printf("*");
	}
}