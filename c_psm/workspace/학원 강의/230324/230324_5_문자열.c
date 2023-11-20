#include<stdio.h>


void main() {
	char a = ' ';

	scanf_s("%c", &a);
	a >= 65 && a <= 90 ? a += 32 : a >= 97 && a <= 122 ? a -= 32 : " ";
	printf("%c",a);

}