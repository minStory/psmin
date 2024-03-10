#include<stdio.h>
void main() {

	int num = 0;

	printf("¸î ´Ü?");
	scanf_s("%d", &num);
	
	for (int i = 0; i < 10; i++) {
		

		printf("%d * %d = %d\n", num, i+1,num*(i+1));

		
	}


}