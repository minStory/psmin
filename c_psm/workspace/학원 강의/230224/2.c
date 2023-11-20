#include<stdio.h>
void main() {

	int T;

	scanf_s("%d", &T);
	
	for (int i = 0; i < T; i++) {

		int a = 0, b = 0;
		scanf_s("%d %d", &a,&b);

		printf("%d\n", a+b);


	}


}