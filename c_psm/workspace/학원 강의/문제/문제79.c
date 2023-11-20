#include<stdio.h>
#include<string.h>
void main() {
	char apb = ' ';
	while (apb != 'q') {
		scanf_s(" %c", &apb);
		printf("%c\n", apb);
	}
}