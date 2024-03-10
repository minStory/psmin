#include<stdio.h>
#include<string.h>

void main() {

	//char greet[14] = "Hello, Guys!";
	//printf("1차원 배열 greet의 길이는 : %d\n", sizeof(greet));
	//printf("널 문자 문자열 출력 : %c \n", greet[13]);
	//printf("널 문자 정수열 출력 : %d \n", greet[13]);

	char str[100];
	int len = 0;

	printf("입력: ");
	scanf_s("%s", str, sizeof(str));

	len = strlen(str);
	printf("출력: ");

	for (int i = len - 1; i >= 0; --i) {
		printf("%c", str[i]);
	}
	printf("\n");


}