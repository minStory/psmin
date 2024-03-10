#include<stdio.h>
typedef struct
{
	char name[11];		// 문자열 글자당 한글 2Byte, 영어 및 나머지 1Byte + NULL 1Byte (최대 한글5글자)
	int kor;
	int eng;
	int math;
}S;
void main() {
	S abc[3] = { 0, };

	for (int i = 0; i < 3; i++) {
		scanf_s("%s %d %d %d",abc[i].name, sizeof(abc[i].name), &abc[i].kor, &abc[i].eng, &abc[i].math);
	}
	for (int i = 0; i < 3; i++) {
		printf("%s %.1f\n", abc[i].name, (float)(abc[i].kor + abc[i].eng + abc[i].math) / 3);
	}
}
