#include<stdio.h>
#include<string.h>
void main() {

	char word[10] = "";
	int max = 0;

	printf("���ܾ� �Է� : ");
	scanf_s("%s", word, sizeof(word));

	for (int i = 0; i < strlen(word) ; i++) {
		
		if (max < word[i]) { max = word[i]; }
	}
	
	printf("�ƽ�Ű�ڵ尪�� ���� ū ���� : %c", max);


}//���� ū �ƽ�Ű�ڵ尪 ���ϱ� �Ϸ�