#include<stdio.h>
void main() {
	int second, minute, hour = 0;

	printf("�ʸ� �Է��ϼ��� : ");
	scanf_s("%d", &second);

	hour = (second / 60)/60;
	minute = (second/60) % 60;
	second = second % 60;

	printf("%d�ð� %d�� %d��", hour,minute,second);

	return 0;


}