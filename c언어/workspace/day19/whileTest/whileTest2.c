#include<stdio.h>
void main() {

	char* qMsg = "����� ��������?";
	char* choiceMsg = "1.A\n2.B\n3.O\n4.AB\n5.������";
	char* aMsg = "�Ĳ��ϰ� �����ϴ�.";
	char* bMsg = "�������� ����.";
	char* oMsg = "�米���� ����.";
	char* abMsg = "���ϴ�.";
	char* errorMsg = "�ٽ� �õ����ּ���.";

	char* resultMsg = "";

	int choice = 0;


	while (choice != 5) {
		printf("%s\n%s\n", qMsg, choiceMsg);
		scanf_s("%d", &choice);


	}

	switch (choice) {

	case 1:							//int�� ����, �����̸� '' ���̱�
		printf("%s", aMsg);		// printf�� �����ϱ� ���� ���� resultMsg �ʱ�ȭ 
		break;						// break; ������ ���̱�
	case 2:
		resultMsg = bMsg;
		puts("����");			// ������ break; �� Ż���ϱ� �� puts�̱� ������ ���� ��Ÿ��
		break;
	case 3:
		resultMsg = oMsg;
		break;
	case 4:
		resultMsg = abMsg;
		break;
	default:
		resultMsg = errorMsg;
		break;
	}

	if (choice == 5) {
		resultMsg = "�����մϴ�.";
	}

	puts(resultMsg);







}