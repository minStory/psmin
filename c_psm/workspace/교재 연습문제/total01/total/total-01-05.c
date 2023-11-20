#include<stdio.h>
void main() {
	int second, minute, hour = 0;

	printf("초를 입력하세요 : ");
	scanf_s("%d", &second);

	hour = (second / 60)/60;
	minute = (second/60) % 60;
	second = second % 60;

	printf("%d시간 %d분 %d초", hour,minute,second);

	return 0;


}