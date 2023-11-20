#include<stdio.h>
void main() {
	int age = 0, height = 0;

	printf("나이를 입력하세요 : ");
	scanf_s("%d", &age);
	printf("키를 입력하세요 : ");
	scanf_s("%d", &height);

	age >= 12 && height >= 120 ? printf("놀이기구에 탑승할 수 있습니다!") : printf("놀이기구에 탑승할 수 없습니다!");

}