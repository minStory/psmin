#include<stdio.h>
typedef struct
{
	char name[11];		// ���ڿ� ���ڴ� �ѱ� 2Byte, ���� �� ������ 1Byte + NULL 1Byte (�ִ� �ѱ�5����)
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
