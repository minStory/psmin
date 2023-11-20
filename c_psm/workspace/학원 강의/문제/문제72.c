#include<stdio.h>
#include<string.h>
void main() {
	int a = 0, b = 0, cnt=0;
	scanf_s("%d", &a);
	reload:
	scanf_s("%d", &b);
	printf("%d\n", b);
	if (++cnt != a) {
		goto reload;
	}

}