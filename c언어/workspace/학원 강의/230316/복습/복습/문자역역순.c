//����ڷκ��� ��� �Է� �޾Ƽ� char�� �迭�� �����Ѵ�.�� ���� �迭�� ����� ��� �������� �����´�.�׸��� �������� ����Ѵ�
//
//�Է� Love
//��� evoL

#include<stdio.h>
#include<stdlib.h>		//���ڿ� ���� �������
void main() {
	char word[50] = { 0, };		//�˳��� 50ĭ ����
	scanf_s("%s", word, sizeof(word));	//���ڿ� �Է�
	printf("%s\n", word);	//���ڿ� �Է� Ȯ��

	int len = strlen(word);	//NULL�� ���� ���ڿ� ���� ���ϱ�
	printf("%d\n", len);	//���ڿ� ���� Ȯ��

	for (int i = 0; i < len; i++) {	// %c�� ������ ���ڿ����� �ݺ��Ͽ� ���
		printf("%c", word[len - 1 - i]);
	}
}