#include<stdio.h>
void main() {
	int age = 0;

	printf("���̸� �Է��ϼ��� : ");
	scanf_s("%d", &age);

	if (age>=65 || age<6){
		printf("����");
	}
	else if (age >= 19) {
		printf("1250��");
	}
	else if (age >= 13) {
		printf("900��");
	}
	else if (age >= 6) {
		printf("500��");
	}



}