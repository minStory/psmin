#include<stdio.h>
void main() {


	int num = 0, i=0, sum=0;

	printf("������ �Է��ϼ��� : ");
	scanf_s("%d", &num);

	while (i < num) {
		i++;
		sum += i;
	}
	printf("1���� %d������ ���� %d�Դϴ�.", num, sum);


}


