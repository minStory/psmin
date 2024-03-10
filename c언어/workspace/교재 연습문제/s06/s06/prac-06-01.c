#include<stdio.h>
void main() {

	int a = 0, b = 1250, c = 800;

	printf("나이를 입력하세요 : ");
	scanf_s("%d", &a);

	//a >= 20 ? printf("당신의 나이는 %d세이며, 요금은 %d원입니다!", a, b) : printf("당신의 나이는 %d세이며, 요금은 %d원입니다!", a, c);

	printf("당신의 나이는 %d세이며, 요금은 %d원입니다!", a, a >= 20 ? b : c);

	return 0;

}