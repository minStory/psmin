#include<stdio.h>
#include<string.h>
typedef struct ����ü�̸�
{
	�ڷ��� ������;
	�ڷ��� ������;

}����ü��Ī;

struct score {
	char name[10];
	int kor;
	int mat;
	int eng;

}S;

void main() {
	//�ʱ�ȭ ���1 -> ���� �� �ٷ� �ʱ�ȭ
	struct score s1 = { "������",50,40,70 };

	//�ʱ�ȭ ���2 -> ���� �� .�� Ȱ���ؼ� �ʱ�ȭ
	struct score s2;
	strcpy_s(s2.name, "�󸶹�");
	s2.kor = 60;
	s2.mat = 70;
	s2.eng = 80;




}