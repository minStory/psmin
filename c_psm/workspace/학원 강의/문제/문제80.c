#include<stdio.h>
#include<string.h>
void main() {
	int n = 0, sum = 0, i=0;
	scanf_s("%d", &n);
	while (n>sum) {
		i++;
		sum += i;
	}
	printf("%d", i);
}