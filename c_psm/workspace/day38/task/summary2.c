#include<stdio.h>
void main() {

	//1��
	//for (int i = 100; i <= 200; i++) {
	//	if (i % 3 == 0||i%7==0) {
	//		printf("%d ", i);
	//	}
	//}

	//2��
	//int a = 0, b = 0, temp=0;

	//scanf_s("%d %d", &a, &b);
	//if (a > b) {
	//	temp = a;
	//	a = b;
	//	b = temp;
	//}
	//for (; a <= b; a++) {
	//		for (int j = 0; j < 9; j++) {
	//			printf("%.2d * %.2d = %.2d ", a, j + 1, a * (j + 1));
	//		}
	//		printf("\n");
	//	}

	//3��
	//int n = 2;	//�Ҽ��� �ּҰ��� 2���� ����
	//int count = 0;	//��Ÿ�� ���� ����

	//while (count < 10) {	//�ݺ� Ƚ���� �˼� ���⿡ while�� ���, ������ ��Ÿ�� �� 10���� �� �� ����
	//	for (int i = 2; ; i++) {		//for�� ����Ͽ� �Ҽ��� �ּҰ����� �ݺ� ����
	//		if (i == n) {		// �ݺ��� �ϴٰ� �� ���� ���� ���� �� ���
	//			printf("%d ", n);
	//			count++;	//��Ÿ�� ���� ���� ����
	//			break;		//for�� Ż��
	//		}
	//		else if (n % i ==0) { break; }	// �ΰ� ���̿� ����� ������ �� for�� Ż��
	//	}
	//	n++; //for�� Ż���Ͽ� �񱳰� ����
	//}

	//for (int i = 1; i <= 30; i++) {
	//	int rest = 0;
	//	for (int j = 1; j <= i; j++) {
	//		if (i % j == 0) { rest++; }
	//	}
	//	if (rest == 2) { printf("%d ", i); }
	//}

	//4��

	//int a = 0, b = 0;
	//char oper=' ';

	//printf("�ǿ����� 1 : ");
	//scanf_s("%d", &a);
	//printf("������ : ");
	//scanf_s(" %c", &oper); //���� �ڵ� ���� ������ ���� �Ǿտ� ���� ��ĭ �ֱ�
	//printf("�ǿ����� 2 : ");
	//scanf_s("%d", &b);

	//if (oper == '+') {
	//	printf("%d %c %d = %d", a, oper, b, a + b);
	//}
	//else if (oper == '-') {
	//	printf("%d %c %d = %d", a, oper, b, a - b);
	//}
	//else if (oper == '*') {
	//	printf("%d %c %d = %d", a, oper, b, a * b);
	//}
	//else if (oper == '/') {
	//	printf("%d %c %d = %d", a, oper, b, a / b);
	//}
	//else if (oper == '%') {
	//	printf("%d %c %d = %d", a, oper, b, a % b);
	//}

	//switch (oper) {
	//case '+':
	//	printf("%d %c %d = %d", a,oper, b, a + b);
	//	break;
	//case '-':
	//	printf("%d %c %d = %d", a,oper, b, a - b);
	//	break;
	//case '*':
	//	printf("%d %c %d = %d", a,oper, b, a * b);
	//	break;
	//case '/':
	//	printf("%d %c %d = %d", a,oper, b, a / b);
	//	break;
	// case '%':
	// printf("%d %c %d = %d", a, oper, b, a % b);
	// break;
	//default:
	//	break;
	//}

	//5��
	int a = 1, b = 1, next = 0;
	int cnt = 0;	//�ݺ� Ƚ�� ����

	scanf_s("%d", &cnt);

	for (int i = 0; i < cnt; i++) {
		printf("%d ", a);		//���� �ʱⰪ ���
		next = a + b;		//3��° ���� 1��°��+2��°�� ���
		a = b;			// 1��°���� 2��°�� ���
		b = next;		// 2��°���� 3��°�� ���
		}
}

