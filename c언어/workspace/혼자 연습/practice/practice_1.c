#include<stdio.h>

void main() {

	int n1 = 0, n2 = 0, n3 = 0, n4=0;

	printf("몇을 고를래? ");
	scanf_s("%d", &n1);
	
	printf("몇을 고를래? ");
	scanf_s("%d", &n2);

	printf("이번엔 몇을 고를래? ");
	scanf_s("%d", &n3);

	n4 = 999;


	printf("너가 고른것들은 %d와 %d, 그리고 %d야.\n", n1, n2, n3);

	printf("아무거나 누르면 숫자를 나타내고 꺼질게");
		scanf_s("%d", &n2);

		printf("%d", n4);




}