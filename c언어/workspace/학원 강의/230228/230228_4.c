#include<stdio.h>
int add(int num1, int num2) {
	return num1 + num2;
}
void ShowaddResult(int num) {
	printf("������� ���: %d", num);
}
int ReadNum(void) {
	int num;
	scanf_s("%d", &num);
	return num;
}
void HowToUseThisProg(void) {
		printf("�� ���� ������ �Է��Ͻø� ������� ��µ�\n");
		printf("�׷� ��� :\n");
}
void main(void) {
		int result, num1, num2;
		HowToUseThisProg();
		num1 = ReadNum();
		num2 = ReadNum();
		result = add(num1, num2);
		ShowaddResult(result);

		return 0;
}



