#include<stdio.h>
void main() {

	int num = 0;

	printf("�������� ������ : ");
	scanf_s("%d", &num);

	//num%10==0 ? printf("�ʿ��� �ٱ����� ��: %d",num/10):printf("�ʿ��� �ٱ����� �� : %d", num / 10 + 1);

	printf("�ʿ��� �ٱ����� �� : %d", num%10 == 0 ? num/10 : num/10 + 1);

	return 0;


}