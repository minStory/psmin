#include<stdio.h>
#include<string.h>

void main() {

	//char greet[14] = "Hello, Guys!";
	//printf("1���� �迭 greet�� ���̴� : %d\n", sizeof(greet));
	//printf("�� ���� ���ڿ� ��� : %c \n", greet[13]);
	//printf("�� ���� ������ ��� : %d \n", greet[13]);

	char str[100];
	int len = 0;

	printf("�Է�: ");
	scanf_s("%s", str, sizeof(str));

	len = strlen(str);
	printf("���: ");

	for (int i = len - 1; i >= 0; --i) {
		printf("%c", str[i]);
	}
	printf("\n");


}