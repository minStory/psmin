#include<stdio.h>
//& -> �ǿ������� �޸� �ּҸ� ��ȯ�ϴ� ������
//*(����������) -> �ǿ����ڰ� 2��
//*(�����Ϳ�����) -> �ǿ����ڰ� 1���� ���׿�����
void main() {
	int num1 = 100, num2 = 100;
	int* pnum;	//4����Ʈ�� pnum�� ���������� �ؼ�

	pnum = &num1;	//pnum�� num1�� �ּҰ��� ����Ŵ
	(*pnum) += 30;	// = num1+=30
	pnum = &num2;
	(*pnum) -= 30;	// = num2-=30

	printf("num1 : %d, num2 : %d\n", num1, num2);
}
