#include<stdio.h>
#include<string.h>

void main() {
	
	char word[10] = " ";

	int len = 0;
	int temp = 0;

	printf("���ܾ� �Է� : ");
	scanf_s("%s", word, sizeof(word));

	len = strlen(word);

	for (int i = 0; i < len / 2; i++) {
		temp = word[i];
		word[i] = word[len - i - 1];
		word[len - i - 1] = temp;
		
	}
		printf("������ ��� :%s", word);

}//���ڿ� ������ �Ϸ�