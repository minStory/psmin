#include<stdio.h>
#include<stdlib.h>
#include<string.h>
void main() {

	//1��
	//int arr[5] = { 0 };
	//int max = 0, min = 0, total = 0;
	//for (int i = 0; i < 5; i++) {
	//	printf("NUM%d : ", i + 1);
	//	scanf_s("%d", &arr[i]);
	//}
	//min = arr[0];
	//for (int i = 0; i < 5; i++) {
	//	if (max < arr[i]) { max = arr[i]; }
	//	if (min > arr[i]) { min = arr[i]; }
	//	total += arr[i];
	//}
	//printf("�ִ밪 : %d\n�ּҰ� : %d\n���հ� : %d", max, min, total);

	//2��
	//int arr[8] = { 0 };
	//
	//for (int i = 0; i < 8; i++) {
	//	printf("NUM%d : ", i + 1);
	//	scanf_s("%d", &arr[i]);
	//}
	//printf("Ȧ�� : ");
	//for (int i = 0; i < 8; i++) {
	//	if (arr[i] % 2) { printf("%d ", arr[i]); }
	//}
	//printf("\n¦�� : ");
	//for (int i = 0; i < 8; i++) {
	//	if (!(arr[i] % 2)) { printf("%d ", arr[i]); }
	//}

	//3��

	//int* num = 0;	//�����ͺ��� ����
	//int n = 0;			//�Է¹��� ���� ����
	//scanf_s("%d", &n);

	//int temp = 0;		//�ӽ÷� �Է¹��� ������ ���� ���� ����
	//int len = 0;		//�Է¹��� ������ ���̸� ���� ���� ����
	//temp = n;			//�ӽú����� ������ ����
	//while (temp > 1) {	//������ 1���� �۾��� ������ /10 �ݺ��Ͽ� ���� ���� ����
	//	temp /= 10;
	//	len++;
	//}
	//num = (int*)calloc(len, sizeof(int));		//�Է¹��� ������ ���̸�ŭ �����Ҵ� ����

	//int multi = 1;		//10�� �ݺ�.�����Ͽ� ���� ���� ���� (���ϱ��̱� ������ 0���� ���� �Ұ�)
	//for (int i = 0; i < len; i++) {	//������ ���̸�ŭ �ݺ�
	//	temp = n;		//�ݺ��� ������ ������ �ӽú��� ���� �Է¹��� ���������� �ʱ�ȭ
	//	num[i] = temp/multi%10;	//�迭�� ù��° Index�� �Է¹��� ������ 1���ڸ����� �������� ����
	//	multi *= 10;	// �ݺ��� ���������� *10�� �������� ���� �ڸ��� ��ȯ
	//}

	//for (int i = 0; i < len; i++) {	//�ڸ����� ���̸�ŭ �������� ���
	//	for (int j = len-1 - i; j >= 0; j--) {	//���� �ݺ��Ͽ� ��ĭ�� �ٿ����� ���
	//		printf("%d ", num[j]);
	//	}
	//	printf("\n");
	//}

	//4��
	//char word[30] = "";	//���ڿ� ����
	//char temp[30] = "";	//���� ���ڿ� ����

	//printf("���ڿ� �Է� : ");
	//scanf_s("%s", word, sizeof(word));	//���ڿ� �Է�

	//int len = strlen(word);	//�Է¹��� ���ڿ� ���� ����
	//for (int i = 0; i < len; i++) {	//���ڿ��� �������� ���� ���ڿ��� ����
	//	temp[len-1-i] = word[i];
	//}
	//printf(!strcmp(word,temp) ? "�����մϴ�." : "�������� �ʽ��ϴ�.");	//���ڿ� ���Լ��� ��

	//int cnt = 0;	//strcmp �̻�� �� cnt�� len�� ���̷� ��
	//for (int i = 0; i < len; i++) {
	//	if (word[i] == temp[i]) { cnt++; }
	//}
	
	//int isSame = 0;		//�ѵ��� ���� Ǯ��
	//for (int i = 0; i < len; i++) {
	//	if (word[i] == word[len - 1 - i]) {
	//		isSame = 1;
	//	}
	//	else { 
	//		isSame = 0;
	//		break;
	//	}
	//}
	//printf(issame ? "�����մϴ�" : "�������� �ʽ��ϴ�");
	// 
	// 
	//5�� ���߿� Ǯ� ��
	int year = 0, month = 0;
	int sum = 0;
	int check = 0;
	int days[12] = { 31,28,31,30,31,30,31,31,30,31,30,31 };

	printf("����� ���� : ");
	scanf_s("%d", &year);
	printf("����� �� : ");
	scanf_s("%d", &month);



}
