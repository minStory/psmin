#include<stdio.h>
#include<stdlib.h>
#include<time.h>

void main() {


		//��Ʈ��
	//	int count = 0;
	//
	//	scanf_s("%d", &count);
	//
	//	for (int i = 0; i < count; i++) {
	//		for (int j = count - 1; j > i; j--) {
	//			printf(" ");
	//		}
	//		for (int k = 0; k <= i; k++) {
	//			printf("*");
	//		}
	//		printf("\n");
	//
	//	}
	//}


		//�� ��Ʈ��
	//	int count = 0;
	//
	//	scanf_s("%d", &count);
	//
	//	for (int i = 0; i < count; i++) {
	//		for (int j = 0; j < i; j++) {
	//			printf(" ");
	//		}
	//		for (int k = count; k > i; k--) {
	//			printf("*");
	//		}
	//		printf("\n");
	//
	//	}
	//}

	// ������
//	int num = 0;
//
//	printf("��� ? ");
//	scanf_s("%d", &num);
//
//	for (int i = 1; i < 10; i++) {
//		printf("%d * %d = %d\n", num, i, num * i);
//	}
//}


	//���� a, b �޾� a���� b������ �հ� ���ϱ�
	int a = 0, b = 0;
	int sum = 0;

	printf("�� ���� �Է� : ");
	scanf_s("%d %d", &a, &b);

	for (; a <= b; a++) {
		sum += a;
	}

	//for (int i = 0; i <= b - a; i++) {
	//	for (; a <= b; a++) {
	//		sum += a;
	//	}
	//}
	printf("�� : %d", sum);
}
 

	
	//	srand(time(NULL));
	//	int select;
	//	int pc_select = rand() % 3 + 1;
	//	printf("���� 1:����, 2:����, 3:��\n");

	//	scanf_s("%d", &select);

	//	printf("��ǻ���� ���� : %d\n", pc_select);

	//	if (select == pc_select) {
	//		printf("���\n");
	//	}
	//	else if (select == 1 && pc_select == 2 || select == 2 && pc_select == 3 || select == 3 && pc_select == 1) {
	//		printf("��\n");
	//	}
	//	else {
	//		printf("�̱�\n");
	//	}

	//}