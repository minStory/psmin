//사용자로부터 영어를 입력 받아서 char형 배열에 저장한다.그 다음 배열에 저장된 영어를 역순으로 뒤집는다.그리고 역순인지 출력한다
//
//입력 Love
//출력 evoL

#include<stdio.h>
#include<string.h>
void main() {
	char str[10] = " ";
	int len = 0;

	printf("입력 : ");
	scanf_s("%s", str,sizeof(str));

	len = strlen(str);

	for (int i = 0; i < len; i++)
		printf("%c", str[len-1-i]);
	}


