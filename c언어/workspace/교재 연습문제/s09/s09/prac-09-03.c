#include<stdio.h>
#include<string.h>
void main() {

	char word[10] = "";
	int max = 0;

	printf("영단어 입력 : ");
	scanf_s("%s", word, sizeof(word));

	for (int i = 0; i < strlen(word) ; i++) {
		
		if (max < word[i]) { max = word[i]; }
	}
	
	printf("아스키코드값이 가장 큰 문자 : %c", max);


}//가장 큰 아스키코드값 구하기 완료