#include<stdio.h>
void main() {
	int a = 0,b=0,c=0,d=0,e=0, aver=0;

	printf("�� �� �� �� �� �� ������ ������ ���ʷ� �����ϼ���.\n");
	scanf_s("%d %d %d %d %d", &a, &b, &c, &d, &e);

	aver = (a + b + c + d + e) / 5;
	
	printf("��� ������ %d���̸�,\n", aver);


	switch(aver/10)
	{
	case 10:
	case 9:
		printf("��� ������ A��� �Դϴ�.");
		break;
	case 8:
		printf("��� ������ B��� �Դϴ�.");
		break;
	case 7:
		printf("��� ������ C��� �Դϴ�.");
		break;
	case 6 :
		printf("��� ������ D��� �Դϴ�.");
		break;
	default:
		printf("��� ������ F��� �Դϴ�.");
		break;

	}
	return 0;



}