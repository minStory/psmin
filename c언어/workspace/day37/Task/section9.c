#include<stdio.h>
#include<string.h>
void main() {

	//1��
//	int arData[5] = { 2,5,8,17,21 };
//	int sum = 0;
//
//	for (int i = 0; i < 5; i++) {
//		sum += arData[i];
//	}
//	printf("���� : %d\n", sum);
//	printf("��� : %.1f\n", (float)sum / 5);
//}

	//2��

//	char word[30] = "";
//
//	printf("���ܾ� �Է� : ");
//	scanf_s("%s", word, sizeof(word));
//
//	int len=strlen(word);
//
//	for (int i = 0; i<len; i++) {
//		printf("%c", word[len - 1 - i]);
//	}
//}

	//3��

	char word[30] = "";
	int len = 0;
	int max = 0;

	printf("���ܾ� �Է� : ");
	scanf_s("%s", word, sizeof(word));

	len = strlen(word);

	for (int i = 0; i < len; i++) {

			if (max < word[i]) { max = word[i]; }
		
	}
	printf("�ƽ�Ű�ڵ尡 ���� ū ���� : %c", max);

}