//���� ����
//�����̴� �������� ��������JH�������ֱ� ���� �������� ����ó�� ���α׷��� ������ �ߴ�.
//�������� Ư�� ���񿡼� 1���� �л��� �ٸ� ���񿡼��� � ������ ������� ������ ����.
//���� ������ �����ϴ� ���α׷��� �ۼ��� ����.
//
//�Է�
//ù° �ٿ� �������� ����
//n(3 <= n <= 100)
//
//��° �ٺ��� n + 1�ٿ� �л� �̸���
//3���� �������� �������� ���еǾ� �Էµȴ�. (�Է� ���� ����)
//
//�� �̸��� ���̴� �ִ�
//10����Ʈ �̳��̴�
//
//���
//ù ��° ������
//1���� �л��� �̸��� �� ��°, �� ��° ������ ������ �������� �����Ͽ� ����Ѵ�.
//
//�� ù ��° ������
//1����
//1���̶�� �����Ѵ�.
//
//�Է� ����
//4
//Jeon 95 80 100
//Kim 59 85 75
//Lee 90 100 75
//Bae 100 82 80
//
//��� ����
//Bae 3 2

#include<stdio.h>
typedef struct School
{
	char name[10];
	int fir;
	int sec;
	int thi;
}S;

void main() {
	int n = 0;
	S* emp = 0;

	scanf_s("%d", &n);	

	emp = (int*)calloc(n, sizeof(int));

	for(int i=0;i<n;i++){
		scanf_s("%s", emp->name,sizeof(emp->name));
		scanf_s("%d", &emp->fir);
		scanf_s("%d", &emp->sec);
		scanf_s("%d", &emp->thi);
	}
	//int firMax = 0;
	//char firMaxName = "";
	//int theSec = 0;
	//int theThi = 0;
	S temp;
	for (int i = 0; i < n - 1; i++) {
		for (int j = i + 1; j < n; j++) {
			if (emp[i].fir < emp[j].fir) {
				temp = emp[i];
				emp[i] = emp[j];
				emp[j] = temp;
			}
		}
	}
	for (int i = 0; i < n; i++) {
		if()
	}


	printf("%s", emp[0].name);
	printf("%d", emp[0].fir);

}








