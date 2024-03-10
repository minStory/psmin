#include<stdio.h>
#include<string.h>
void main() {
	int score = 0;
	scanf_s("%d", &score);

	printf("%c", score > 100 ? 0 : score >= 90 ? 'A' : score >= 70 ? 'B' : score >= 40 ? 'C' : score >= 0 ? 'D' : 0);
}