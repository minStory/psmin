#include<stdio.h>
void main() {

	int num = 0;   // 자동형변형 가능

	printf("NUM : ");
	scanf_s("%d", &num);


	printf("%d", num%10 );

	return 0;


}