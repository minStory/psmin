#include<stdio.h>

int fac(int num) { //����Լ�
	if (num == 1) {
		return 1;
	}
	else {
		return num * fac(num - 1);
	}
}

//num * fac(num-1) //3����
//
//3   * fac(2) 
//3   * (2 * fac(1)) //fac(1) = 1
//3   * (2 * 1)) = 6

void main() {

	int result;

	printf("���� �Է� : ");
	scanf_s("%d", &result);

	printf("%d! = %d",result, fac(result));
}