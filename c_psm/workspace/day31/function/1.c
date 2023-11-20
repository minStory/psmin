#include<stdio.h>

int getTotalFromN(int end) {
	int total=0;
	for (int i = 0; i < end; i++) {
		total += i+1;
	}
	return total;
}

void main() {
	
	printf("%d", getTotalFromN(10));


}