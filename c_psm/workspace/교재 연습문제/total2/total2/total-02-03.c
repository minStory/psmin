#include<stdio.h>
void main() {
	int num = 2;	//2���� ū�� ����
	int cnt = 0;	//����� ���� �ʱ�ȭ

	while (cnt != 10) {	//����� ���� 10��
		for (int i = 2; ; i++) {		//2���� ���Ǿ��� ��� ������ �ݺ�
			if (num == i) {	//num�� i�� ����������
				printf("%d ", num);	//���
				cnt++;				//��°��� 1�� ����
				break;				//for�� Ż��
			}
			else if (num % i == 0) {		//�����⸦ �ݺ��ϴٰ� �߰������� ���������� for�� Ż��
				break;
			}
		}
		num++;	//for�� Ż��� ���� num�� ������Ű��
	}
}






















