//����ڷκ��� ��� �Է� �޾Ƽ� char�� �迭�� �����Ѵ�.�� ���� �迭�� ����� ��� �������� �����´�.�׸��� �������� ����Ѵ�
//
//�Է� Love
//��� evoL

#include<stdio.h>
#include<string.h>
void main() {
	char str[10] = " ";
	int len = 0;

	printf("�Է� : ");
	scanf_s("%s", str,sizeof(str));

	len = strlen(str);

	for (int i = 0; i < len; i++)
		printf("%c", str[len-1-i]);
	}


