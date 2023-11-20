#include<stdio.h>
void main() {
	int second = 0;
	printf("몇 초 : ");
	scanf_s("%d", &second);
	time(second);

}
int time(int second) {
	int h = 0, m = 0, s = 0;
	h = second / 60 / 60;
	m = second / 60 % 60;
	s = second % 60;
	printf("결과 : %d시간/%d분/%d초", h, m, s);
}