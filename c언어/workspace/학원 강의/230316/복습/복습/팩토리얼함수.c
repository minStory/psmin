#include<stdio.h>
int fac(int i) {
	if (i ==1) {	//i�� 1�϶��� ���̻� ������� ����
		return 1;
	}
	else { 
		return i * fac(i - 1); }		//i�� 1�̵Ǳ� ������ ��� �Լ��� ���
}

void main() {
	int i = 0;
	scanf_s("%d", &i);
	printf("%d",fac(i));

}