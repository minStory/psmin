//�����̽��� ���� �� �ܾ���� ����Ʈ�� �־�����, �ܾ���� �ݴ� ������ �������.�� ������ w���� ���ܾ�� �̷���� ������, �� L���� ���ĺ��� ������.
//�� ���� ���ĺ��� �����̽��θ� �̷���� �ִ�.�ܾ� ���̿��� �ϳ��� �����̽��� ����.
//
//�Է�
//ù ���� N�̸�, ��ü ���̽��� �����̴�.
//
//N���� ���̽����� �̾����µ�, �� ���̽��� �����̽��� ����� �ܾ���̴�.�����̽��� ������ ó���� ������ ��Ÿ���� �ʴ´�.N�� L�� ���� ������ ������.
//
//N <= 5
//1 �� L �� 25
//���
//�� ���̽��� ���ؼ�, ���̽� ��ȣ�� x�϶�  "Case #x: " �� ����� �� �� �Ŀ� �̾ �ܾ���� �ݴ� ������ ����Ѵ�.
//
//3
//this is a test
//foobar
//all your base
//
//���
//Case #1: test a is this
//Case #2: foobar
//Case #3: base your all
#include<stdio.h>
#include<string.h>
#include<stdlib.h>
void main() {
	int T = 0;
	char* s = (char*)calloc(150, sizeof(char));
	scanf_s("%d", &T);

	int temp[10] = { 0, };
	int cnt = 0;
	for (int i = 0; i < T; i++) {
		scanf_s(" %[^\n]", s + i * 25, 30);	//scanf_s�� ������� �Է�
		for (int j = 0; j < strlen(s + i * 25); j++) {
			cnt++;
			if (*(s + i * 25 + j) == ' ') {				//1���ھ� �˻��ϴٰ� ������ ������
				for (int k = 0; k < cnt - 1; k++) {
					temp[k] = *(s + i * 25 + j - cnt + 1 + k);		//temp�� ���� �������� ���ڿ��� �����Ѵ�.
					printf("%c", temp[k]);								//temp Ȯ��
				}
				printf("\n");
				for (int k = 0; k < strlen(s + i * 25 - j); k++) {
					*(s + i * 25 + k) = *(s + i * 25 + j + 1 + k);		//���� ���� ���ڸ� 0�������� ��ܿ´�
				}
				for (int k = 0; k < cnt - 1; k++) {
					*(s + i * 25 + strlen(s + i * 25) + k) = temp[k];	//temp�� ������ ���ڿ��� �� �ڷ� ����ִ´�
				}

			}
		}
	}

	for (int i = 0; i < T; i++) {
		printf("Case #%d : %s %d\n", i + 1, s + i * 25, strlen(s + i * 25));	//���
	}
}
