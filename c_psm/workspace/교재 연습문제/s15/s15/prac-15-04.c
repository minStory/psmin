#include<stdio.h>
void main() {
	int height = 0;
	printf("Ű�� cm ������ �Է��ϼ��� : ");
	scanf_s("%f", &height);
	result(height);
}
int result(float height) {
	height /= 100;
	printf("��� : %.2fm", height);
	
}