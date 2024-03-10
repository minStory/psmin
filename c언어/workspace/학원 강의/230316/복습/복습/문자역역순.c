//사용자로부터 영어를 입력 받아서 char형 배열에 저장한다.그 다음 배열에 저장된 영어를 역순으로 뒤집는다.그리고 역순으로 출력한다
//
//입력 Love
//출력 evoL

#include<stdio.h>
#include<stdlib.h>		//문자열 관련 헤더파일
void main() {
	char word[50] = { 0, };		//넉넉히 50칸 선언
	scanf_s("%s", word, sizeof(word));	//문자열 입력
	printf("%s\n", word);	//문자열 입력 확인

	int len = strlen(word);	//NULL값 제외 문자열 개수 구하기
	printf("%d\n", len);	//문자열 개수 확인

	for (int i = 0; i < len; i++) {	// %c로 마지막 문자열부터 반복하여 출력
		printf("%c", word[len - 1 - i]);
	}
}