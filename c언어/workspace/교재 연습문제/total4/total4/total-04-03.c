#include<stdio.h>
#include<stdlib.h>
#include<time.h>
void main() {
	srand(time(NULL));
	int comChoice = rand();
	int myChoice = 0;
	char* scissors = "����";
	char* rock= "����";
	char* paper = "��";

	printf("%s 1 %s 2 %s 3 ���� 0\n����� ������ : ", scissors, rock, paper);
	scanf_s("%d", &myChoice);

	while (myChoice != comChoice) {
		comChoice = rand();
		while (comChoice %= 4) {
			if (myChoice == 1) {
				if (comChoice == 1) { printf("����� %s, ��ǻ�� ������ %s, �����ϴ�.\n", scissors, scissors); scanf_s("%d", &myChoice); }
				else if (comChoice == 2) { printf("����� %s, ��ǻ�� ������ %s, �����ϴ�.\n", scissors, rock); scanf_s("%d", &myChoice); }
				else if (comChoice == 3) { printf("����� %s, ��ǻ�� ������ %s, �̰���ϴ�.\n", scissors, paper); scanf_s("%d", &myChoice); }
				if (myChoice == 0) { printf("���α׷��� �����մϴ�."); break; }
			}
			if (myChoice == 2) {
				if (comChoice == 1) { printf("����� %s, ��ǻ�� ������ %s, �̰���ϴ�.\n", rock, scissors); scanf_s("%d", &myChoice); }
				else if (comChoice == 2) { printf("����� %s, ��ǻ�� ������ %s, �����ϴ�.\n", rock, rock); scanf_s("%d", &myChoice); }
				else if (comChoice == 3) { printf("����� %s, ��ǻ�� ������ %s, �����ϴ�.\n", rock, paper); scanf_s("%d", &myChoice); }
				if (myChoice == 0) { printf("���α׷��� �����մϴ�."); break; }
			}
			if (myChoice == 3) {
				if (comChoice == 1) { printf("����� %s, ��ǻ�� ������ %s, �����ϴ�.\n", paper, scissors); scanf_s("%d", &myChoice); }
				else if (comChoice == 2) { printf("����� %s, ��ǻ�� ������ %s, �̰���ϴ�.\n", paper, rock); scanf_s("%d", &myChoice); }
				else if (comChoice == 3) { printf("����� %s, ��ǻ�� ������ %s, �����ϴ�.\n", paper, paper); scanf_s("%d", &myChoice); }
				if (myChoice == 0) { printf("���α׷��� �����մϴ�."); break; }
			}
			if (myChoice == 0) { break; }
		}
	}
}
