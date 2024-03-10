#include<stdio.h>
void main() {
	int x = 0;
	printf("정수를 입력하세요 : ");
	scanf_s("%d", &x);

	printf("%d과 %d사이 7의 배수는 %d개입니다!",x,x+200, gap(x));
}
int gap(int x) {
	int cnt = 0;
	for (int i = x; i <= x + 200; i++) {
		if (i % 7==0) { cnt++; }
	}
	return cnt;

}