#include<stdio.h>
void main() {

	int a = 0;


	while (1) {

		scanf_s("%c", &a);
		
		if (a >= 97 && a <= 122) {
				printf("%c 입력했습니다.\n", a);
		}
		
		if (a >= 65 && a <= 90) {
				printf("%c 입력했습니다. 종료합니다.\n",a);
				break;
		}
		

	}

}