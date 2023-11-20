#include<stdio.h>
void main() {
	sum(4, 9);
}

int sum(int x, int y) {
	int total = 0;
	for (int i = x + 1; i < y; i++) {
		total += i;
	}
	printf("%d", total);
}