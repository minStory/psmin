#include<stdio.h>
#include<string.h>
void main() {

	//1번
//	int arData[5] = { 2,5,8,17,21 };
//	int sum = 0;
//
//	for (int i = 0; i < 5; i++) {
//		sum += arData[i];
//	}
//	printf("총합 : %d\n", sum);
//	printf("평균 : %.1f\n", (float)sum / 5);
//}

	//2번

//	char word[30] = "";
//
//	printf("영단어 입력 : ");
//	scanf_s("%s", word, sizeof(word));
//
//	int len=strlen(word);
//
//	for (int i = 0; i<len; i++) {
//		printf("%c", word[len - 1 - i]);
//	}
//}

	//3번

	char word[30] = "";
	int len = 0;
	int max = 0;

	printf("영단어 입력 : ");
	scanf_s("%s", word, sizeof(word));

	len = strlen(word);

	for (int i = 0; i < len; i++) {

			if (max < word[i]) { max = word[i]; }
		
	}
	printf("아스키코드가 가장 큰 문자 : %c", max);

}