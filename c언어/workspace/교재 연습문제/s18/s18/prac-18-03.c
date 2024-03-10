#include<stdio.h>
#include<string.h>
#include<stdlib.h>
void main() {
	int n = 0;
	char* word = 0;
	printf("문자열의 최대 길이는 ? ");
	scanf_s("%d", &n);
	word = (char*)calloc(n, sizeof(char));		//n만큼 char형 동적할당

	printf("문자열 입력 : ");
	scanf_s("%s", word, sizeof(word)*n);		//크기를 sizeof(word)*n or n으로 하여 할당량 이상으로 설정 (부족할 시 에러)
	
	int cnt = 0;
	for (int i = 0; i < strlen(word); i++) {		//문자열의 개수만큼 반복
		word[i] == 'a' ? cnt++ : cnt;				//a가 나올때마다 cnt++
	}

	printf("a의 개수는 : %d개입니다.", cnt);

}