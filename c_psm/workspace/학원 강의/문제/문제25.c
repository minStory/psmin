#include<stdio.h>
#include<string.h>
void main() {
	int a = 0;
	scanf_s("%d", &a);
	
	printf("[%d]\n", a/10000%10*10000);
	printf("[%d]\n", a/1000%10*1000);
	printf("[%d]\n", a/100%10*100);
	printf("[%d]\n", a/10%10*10);
	printf("[%d]\n", a/1%10);

	//int a=0, b = 0, c = 0, d = 0, e = 0;
	//scanf_s("%1d%1d%1d%1d%1d", &a, &b, &c, &d, &e);

	//printf("[%d]\n[%d]\n[%d]\n[%d]\n[%d]\n", a * 10000, b * 1000, c * 100, d * 10, e);
}