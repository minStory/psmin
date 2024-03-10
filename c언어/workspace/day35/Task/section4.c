#include<stdio.h>
void main() {
	//1번
	printf("%-10.3f\n", 152.49861);
	printf("you\tcan\tmake\tit\n");
	printf("\"Everbody say \'hello\'!\"\n");

	//2번
	printf("   *\n");
	printf("  ***\n");
	printf(" *****\n");
	printf("********");


	//3번
	int number = 0;
	printf("값을 입력하세요 : ", number);
	scanf_s("%d", &number);
	printf("입력 값 : %d", number);

}