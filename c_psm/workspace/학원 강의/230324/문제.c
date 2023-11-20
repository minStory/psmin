#include<stdio.h>
#include<string.h>
void main() {
	char* a = 0;
	scanf_s("%s", a, sizeof(a));

	for (int i = 0; i < strlen(a); i++) {
		printf("%c\n", a[i]);
	}

}