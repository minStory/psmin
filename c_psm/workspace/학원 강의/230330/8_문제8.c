//�Ӿ��̳� �ʰ��Դ� 10�� �� �̻� ��� 5 %, 30�� �� �̻� ��� 10 %, 50�� �� �̻� ��� 20 % �� �������ݴϴ�.
//������ ���� ���� price�� �־��� ��, �����ؾ� �� �ݾ��� return �ϵ��� solution �Լ��� �ϼ��غ�����.
//
//���ѻ���
//10 �� price �� 1, 000, 000
//price�� 10�� ������(1�� �ڸ��� 0) �־����ϴ�.
//�Ҽ��� ���ϸ� ���� ������ return�մϴ�.
//
//��� ��)
//price	result
//150, 000	142, 500
//580, 000	464, 000

#include<stdio.h>
int solution();
void main() {
	int price = 0;
	scanf_s("%d", &price);
	printf("%d ", price);
	printf("%d\n", solution(price));
}
int solution(int price) {
	price=price >= 500000 ? price * 0.8 : price >= 300000 ? price * 0.9 : price >= 100000 ? price * 0.95 : price;
	return price;
}