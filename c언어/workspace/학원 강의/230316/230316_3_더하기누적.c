#include<stdio.h>
int sum(int n) {
	int total = 0;
	for (int i = 0; i <= n; i++) {
		total += i;
	}
	return total;
}

void main() {
	
	int n = 0;
	scanf_s("%d", &n);

	printf("%d", sum(n));


}