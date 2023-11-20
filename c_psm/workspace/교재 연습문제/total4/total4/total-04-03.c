#include<stdio.h>
#include<stdlib.h>
#include<time.h>
void main() {
	srand(time(NULL));
	int comChoice = rand();
	int myChoice = 0;
	char* scissors = "가위";
	char* rock= "바위";
	char* paper = "보";

	printf("%s 1 %s 2 %s 3 종료 0\n당신의 선택은 : ", scissors, rock, paper);
	scanf_s("%d", &myChoice);

	while (myChoice != comChoice) {
		comChoice = rand();
		while (comChoice %= 4) {
			if (myChoice == 1) {
				if (comChoice == 1) { printf("당신은 %s, 컴퓨터 난수는 %s, 비겼습니다.\n", scissors, scissors); scanf_s("%d", &myChoice); }
				else if (comChoice == 2) { printf("당신은 %s, 컴퓨터 난수는 %s, 졌습니다.\n", scissors, rock); scanf_s("%d", &myChoice); }
				else if (comChoice == 3) { printf("당신은 %s, 컴퓨터 난수는 %s, 이겼습니다.\n", scissors, paper); scanf_s("%d", &myChoice); }
				if (myChoice == 0) { printf("프로그램을 종료합니다."); break; }
			}
			if (myChoice == 2) {
				if (comChoice == 1) { printf("당신은 %s, 컴퓨터 난수는 %s, 이겼습니다.\n", rock, scissors); scanf_s("%d", &myChoice); }
				else if (comChoice == 2) { printf("당신은 %s, 컴퓨터 난수는 %s, 비겼습니다.\n", rock, rock); scanf_s("%d", &myChoice); }
				else if (comChoice == 3) { printf("당신은 %s, 컴퓨터 난수는 %s, 졌습니다.\n", rock, paper); scanf_s("%d", &myChoice); }
				if (myChoice == 0) { printf("프로그램을 종료합니다."); break; }
			}
			if (myChoice == 3) {
				if (comChoice == 1) { printf("당신은 %s, 컴퓨터 난수는 %s, 졌습니다.\n", paper, scissors); scanf_s("%d", &myChoice); }
				else if (comChoice == 2) { printf("당신은 %s, 컴퓨터 난수는 %s, 이겼습니다.\n", paper, rock); scanf_s("%d", &myChoice); }
				else if (comChoice == 3) { printf("당신은 %s, 컴퓨터 난수는 %s, 비겼습니다.\n", paper, paper); scanf_s("%d", &myChoice); }
				if (myChoice == 0) { printf("프로그램을 종료합니다."); break; }
			}
			if (myChoice == 0) { break; }
		}
	}
}
