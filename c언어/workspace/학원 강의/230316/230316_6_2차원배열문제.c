//����ڷκ��� ������ �� ������ ��� 4��¥�� ������ ������ �����ο� ���� �Է� �޴� ������ �ۼ��غ���
//��, 2���� �迭 ����ϱ�
#include<stdio.h>
void main() {

	int arr[4][2] = { {0}, };
	int sum = 0;

	printf("�� ȣ���� �ο��� �Է�\n");
	for (int i = 0; i < 4; i++) {
		
		for (int j = 0; j < 2; j++) {
			printf("%d0%dȣ : ", i + 1, j + 1);
			scanf_s("%d", &arr[i][j]);
		}
	}


	for (int i = 0; i < 4; i++) {
		for (int j = 0; j < 2; j++) {
			sum = 0;
			sum += arr[i][j];
		}
			printf("%d�� �� %d��\n", i + 1, sum);
	}


}