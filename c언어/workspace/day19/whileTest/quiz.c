#include<stdio.h>
void main() {
	char* msg = "Q. 다음 중 동물이 아닌 것은?";
	char* choiceMsg = "1.강아지\n2.고양이\n3.코뿔소\n4.어묵";
	

	int choice = 0;
	int answer = 4;

	char* resultMsg = "";

	while (1) {
		printf("%s\n%s\n", msg, choiceMsg);
		scanf_s("%d", &choice);

		if (choice == answer) {
			resultMsg="정답!";
		}
		else if (choice > 0 && choice < 4) {
			resultMsg = "오답ㅠㅠ";
		}

		else {
			resultMsg = "다시 시도해주세요.";
		}
			printf("%s\n", resultMsg);

			if (choice == answer) { break; }

		}
		}
		