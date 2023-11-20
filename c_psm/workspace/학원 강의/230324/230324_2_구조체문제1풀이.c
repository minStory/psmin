#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h>

typedef struct _student {
	char name[10];
	int a;         //ù ��° ���� ����
	int a_rank;   // ù ��° ���� ��� 
	int b;         //�� ��° ���� ����
	int b_rank;   // �� ��° ���� ���
	int c;         //�� ��° ���� ����
	int c_rank;   // �� ��° ���� ���

}student;

int main(void) {
	int n;
	student s[100];
	scanf("%d", &n);

	for (int i = 0; i < n; i++)
		scanf("%s %d %d %d", s[i].name, &s[i].a, &s[i].b, &s[i].c);

	/*ù ��° �������� ����*/
	for (int i = n - 1; i > 0; i--) {
		for (int j = 0; j < i; j++) {
			if (s[j].a < s[j + 1].a) {
				student tmp = s[j];
				s[j] = s[j + 1];
				s[j + 1] = tmp;
			}
		}
	}
	/*1�� ���*/
	s[0].a_rank = 1;

	/*�ι�° �������� ����*/
	for (int i = n - 1; i > 0; i--) {
		for (int j = 0; j < i; j++) {
			if (s[j].b < s[j + 1].b) {
				student tmp = s[j];
				s[j] = s[j + 1];
				s[j + 1] = tmp;

			}
		}
	}
	/*���ĵ� ������ ������ ����� �ٲ��ֱ�*/
	int cnt;
	for (int i = 0; i < n; i++) {
		if (i > 0 && s[i - 1].b == s[i].b)  //���� ��� ó��
			s[i].b_rank = cnt;
		else {
			cnt = i + 1;
			s[i].b_rank = cnt;
		}
	}
	/*����° �������� ����*/
	for (int i = n - 1; i > 0; i--) {
		for (int j = 0; j < i; j++) {
			if (s[j].c < s[j + 1].c) {
				student tmp = s[j];
				s[j] = s[j + 1];
				s[j + 1] = tmp;

			}
		}
	}
	/*���ĵ� ������ ������ ����� �ٲ��ֱ�*/
	cnt = 1;
	for (int i = 0; i < n; i++) {
		if (i > 0 && s[i - 1].c == s[i].c) {  //���� ��� ó��
			s[i].c_rank = cnt;

		}
		else {
			cnt = i + 1;
			s[i].c_rank = cnt;
		}
	}
	/*���*/
	for (int i = 0; i < n; i++) {
		if (s[i].a_rank == 1) {
			printf("%s %d %d\n", s[i].name, s[i].b_rank, s[i].c_rank);

		}

	}
	return 0;
}


//��������
#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>

typedef struct Score {
	char name[20];
	int kor;
	int eng;
	int math;
}S;
int main(void) {
	S info[100];

	int n;
	printf("�л� ���� �Է��ϼ��� >> ");
	scanf("%d", &n);

	printf("�л��̸��� ���� ���� �Է� >> \n");
	for (int i = 0; i < n; i++) {
		scanf("%s %d %d %d", info[i].name, &info[i].kor, &info[i].eng, &info[i].math);
	}

	for (int i = 0; i < n; i++) {
		for (int j = 0; j < i; j++) {
			if (info[i].kor > info[j].kor) { //ù��° ������ ����
				S temp = info[i];
				info[i] = info[j];
				info[j] = temp;
			}
		}
	}


	S temp = info[0]; //�� ����ü �ϳ� �����ؼ� ù��° ���� 1���� �л� ���� �Է�.	


	for (int i = 0; i < n; i++) {
		for (int j = 0; j < i; j++) {
			if (info[i].eng > info[j].eng) { //�ι�° ������ ����
				S temp = info[i];
				info[i] = info[j];
				info[j] = temp;
			}
		}
	}
	for (int i = 0; i < n; i++) { //�ι�° ���������� ������ �����صа��� ������ ����� �ε��� ��ȣ ����
		if (info[i].kor == temp.kor) {
			temp.eng = i + 1;
		}
	}

	for (int i = 0; i < n; i++) {
		for (int j = 0; j < i; j++) {
			if (info[i].math > info[j].math) { //����° ������ ����
				S temp = info[i];
				info[i] = info[j];
				info[j] = temp;
			}
		}
	}
	for (int i = 0; i < n; i++) {	//����° ���������� ������ �����صа��� ������ ����� �ε��� ��ȣ ����
		if (info[i].kor == temp.kor) {
			temp.math = i + 1;
		}
	}

	printf("\n��� : %s %d %d\n", temp.name, temp.eng, temp.math);


	return 0;
}