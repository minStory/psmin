#include<stdio.h>
void main() {
	//1��
	//int num1 = 0, num2 = 0;
	//printf("NUM1 : ");
	//scanf_s("%d", &num1);
	//printf("NUM2 : ");
	//scanf_s("%d", &num2);

	//printf("%d && %d = %d\n", num1, num2, num1 && num2);
	//printf("%d || %d = %d\n", num1, num2, num1 || num2);
	//printf("%d & %d = %d\n", num1, num2, num1 & num2);
	//printf("%d | %d = %d\n", num1, num2, num1 | num2);

	//2��
	//int dec = 0, choice = 0;
	//printf("10���� ���� �Է� : ");
	//scanf_s("%d", &dec);
	//printf("�� ������ ����ұ��? 8������ 1 �Է�, 16������ 2 �Է� : ");
	//scanf_s("%d", &choice);
	//printf(choice == 1 ? "��� : %o" : "��� : %X",dec);

	//3��
	//int peach = 0, fullBasket = 0, basket=0;

	//printf("�������� ������ : ");
	//scanf_s("%d", &peach);

	//fullBasket = peach / 10;
	//basket = fullBasket + (peach % 10 ? 1 : 0);
	//
	//printf("�ʿ��� �ٱ����� �� : %d\n", basket);

	//4��
	//int num = 0;

	//printf("NUM : ");
	//scanf_s("%d", &num);

	//printf("%d\n", (int)num-((int)num/10)*10);

	//printf("%d\n", num % 10);

	//5��
	int hour = 0, min = 0, sec = 0;

	printf("�ʸ� �Է��ϼ��� : ");
	scanf_s("%d", &sec);
	
	hour = sec / (60 * 60);
	//min = sec / 60 - hour * 60;
	min = sec % (60 * 60) / 60;
	sec = sec % 60;

	printf("%d�ð� %d�� %d��", hour, min, sec);

}
