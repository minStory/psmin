#include<stdio.h>
void main() {

	char* qMsg = "당신의 혈액형은?";
	char* choiceMsg = "1.A\n2.B\n3.O\n4.AB";
	char* aMsg = "꼼꼼하고 세심하다.";
	char* bMsg = "추진력이 좋다.";
	char* oMsg = "사교성이 좋다.";
	char* abMsg = "착하다.";
	char* errorMsg = "다시 시도해주세요.";

	int condition1 = 0, condition2 = 0, condition3 = 0, condition4 = 0;

	int choice = 0;

	printf("%s\n%s\n", qMsg, choiceMsg);
	scanf_s("%d", & choice);

	condition1 = choice == 1;
	condition2 = choice == 2;
	condition3 = choice == 3;
	condition4 = choice == 4;

	printf("%s\n",condition1 ? aMsg :
		condition2 ? bMsg :
		condition4 ? oMsg :
		condition4 ? abMsg : errorMsg);




}