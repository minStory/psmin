#include<stdio.h>
void main() {
	int x = 0;
	printf("������ �Է��ϼ��� : ");
	scanf_s("%d", &x);

	printf("%d�� %d���� 7�� ����� %d���Դϴ�!",x,x+200, gap(x));
}
int gap(int x) {
	int cnt = 0;
	for (int i = x; i <= x + 200; i++) {
		if (i % 7==0) { cnt++; }
	}
	return cnt;

}