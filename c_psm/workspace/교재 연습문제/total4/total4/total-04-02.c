#include<stdio.h>
#include<stdlib.h>
#include<time.h>
void main() {
	srand(time(NULL));
	int ranNum = rand();
	int choice = 0;

	printf("������ ���纸����(1~10) ���� : ");
	scanf_s("%d", &choice);

	if (ranNum == choice) { printf("�����Դϴ�. ���α׷��� �����մϴ�.\n"); }	//���ۺ��� ������ ��

	while (ranNum!=choice) {	//������ �ƴ� �� �ݺ��� ����
		ranNum = rand();		//������ ������ ���� �������ش�
		while (ranNum%= 11) {		//������ 11�� ���� �������� �ƴ� �� (0~10�� �ƴ� ��) �ݺ��� ����
			if (ranNum == choice) {		//������ �� ��� �� ����
				printf("�����Դϴ�. ���α׷��� �����մϴ�.\n");
				break;
			}
			else {		//������ �ƴ� �� ��� �� ���Է� -> �ݺ��� ������
				printf("Ʋ�Ƚ��ϴ�. ��õ�!\n");
				scanf_s("%d", &choice);
			}
		}
	}

	//while (ranNum < 0 || ranNum>10) {	//������ 0�� 10���̿� ������ ������ while�� ����
	//	ranNum = rand();	//0�� 10���̿� ���� �� ���� �ݺ�
	//	while (ranNum >= 0 && ranNum <= 10) {	//������ 0�� 10���̿� ���� �� �ߺ�while�� ����
	//		if (ranNum == choice) {	//������ ������ ���� �� ��� -> ����
	//			printf("�����Դϴ�. ���α׷��� �����մϴ�.\n");
	//			break;
	//		}
	//		else {	//������ ������ �ٸ� �� ��� -> ���� ���Է� -> while�� �ݺ�
	//			printf("Ʋ�Ƚ��ϴ�. ��õ�!\n");
	//			scanf_s("%d", &choice);
	//		}
	//	}
	//}
}