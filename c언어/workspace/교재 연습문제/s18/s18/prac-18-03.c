#include<stdio.h>
#include<string.h>
#include<stdlib.h>
void main() {
	int n = 0;
	char* word = 0;
	printf("���ڿ��� �ִ� ���̴� ? ");
	scanf_s("%d", &n);
	word = (char*)calloc(n, sizeof(char));		//n��ŭ char�� �����Ҵ�

	printf("���ڿ� �Է� : ");
	scanf_s("%s", word, sizeof(word)*n);		//ũ�⸦ sizeof(word)*n or n���� �Ͽ� �Ҵ緮 �̻����� ���� (������ �� ����)
	
	int cnt = 0;
	for (int i = 0; i < strlen(word); i++) {		//���ڿ��� ������ŭ �ݺ�
		word[i] == 'a' ? cnt++ : cnt;				//a�� ���ö����� cnt++
	}

	printf("a�� ������ : %d���Դϴ�.", cnt);

}