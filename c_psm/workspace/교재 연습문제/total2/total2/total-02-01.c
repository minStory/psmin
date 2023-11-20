#include<stdio.h>
void main() {


	for (int i = 0; i <= 200; i++) {

		if (i >= 100) {
			if (i%3==0 || i % 7 == 0) {
				printf("%d ", i);
			}
		}
	}
	

}