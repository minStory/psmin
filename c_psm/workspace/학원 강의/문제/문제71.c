#include<stdio.h>
#include<string.h>
void main() {
	int a = 0;
	reload:
	scanf_s("%d", &a);
	if (a != 0) {
		printf("%d\n", a);
		goto reload;
	}

}