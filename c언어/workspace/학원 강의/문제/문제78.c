#include<stdio.h>
#include<string.h>
void main() {
	int a = 0,sum=0;
	scanf_s("%d", &a);
	for (int i = 0; i <= a; i++) {
			if (i % 2==0) {	sum += i; }
	}
	printf("%d", sum);
}