#include<stdio.h>
#include<string.h>
void main() {
	char alpha = ' ';
	scanf_s("%c", &alpha);
	for (int i = 97; i <= alpha; i++) {
		printf("%c\n", i);
	}

}