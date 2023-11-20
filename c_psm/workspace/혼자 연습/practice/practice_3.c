#include<stdio.h>

void main() {
	
	int age, height, result;

	printf("나이를 입력하세요 : ");
	scanf_s("%d", &age);

	printf("키를 입력하세요 : ");
	scanf_s("%d", & height);

	result = age >= 12 && height >= 120 ? "놀이기구에 탑승할 수 있습니다!" : "놀이기구에 탑승할 수 없습니다!";

	printf("%s\n", result);


	
	if (age >= 12&&height>120) {
		printf("놀이기구에 탑승할 수 있습니다!");
	}
	else
	{printf("놀이기구에 탑승할 수 없습니다!");

	}

	
	return 0;

}