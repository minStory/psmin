#include<stdio.h>
void main() {

	//for (int i = 1; 6*i < 100; i++) {
	//	printf("%d ", 6 * i);
	//}

	for (int i = 1; i <= 100; i++) {
		if (i % 6 == 0) {
			printf("%d ", i);
		}
	}

}