#include<stdio.h>
void main() {

	int student[31] = { 0, }; //�л���
	int num = 0;

	for (int i = 0; i < 28; i++) { //�Է�
		scanf_s("%d", &num);
		student[num] = num;		// ������ ��� ��ȣ ����
	}
	for (int i = 1; i < 31; i++) { //�������� ���� ��� �� 0 ���
		if (student[i] == 0) { printf("�������� ���� ��� : %d\n", i); }
	}
}
//�ڵ�� 1430�� ����

//#include<stdio.h>
//void main() {
//	int n = 0, m = 0;
//	int a = 0, b = 0;
//	int N[1000] = { 0 };
//	int M[1000] = { 0 };
//	scanf_s("%d", &n);
//	for (int i = 0; i < n; i++) {
//		scanf_s("%d", &a);
//		N[a] = a;
//	}
//	scanf_s("%d", &m);
//	for (int i = 0; i < m; i++) {
//		scanf_s("%d", &b);
//		M[b] = b;
//		if (M[b] == N[b]) {
//			printf("1 ");
//		}
//		else if (M[b] > N[b]) {
//			printf("0 ");
//		}
//	}
//}


