#include<stdio.h>

int fac(int num) { //����Լ�
	if (num ==1) {
		return 1;
	}
	else {
		return num * fac(num - 1);
	}
}

void main() {

	int n, result = 1;

	printf("���� �Է� : ");
	scanf_s("%d", &n);

	result = fac(n);
	printf("%d! =%d\n", n, result);
}