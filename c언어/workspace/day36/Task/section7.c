#include<stdio.h>
void main() {
	//2��

	//int num = 0;

	//printf("������ �Է��ϼ��� : ");
	//scanf_s("%d", &num);
	//
	//printf(num % 2 ? "�Էµ� ������ Ȧ���Դϴ�." : "�Էµ� ������ ¦���Դϴ�."); //���׿�����
	// 
	//if (num % 2) {
	//	printf("�Է��� ������ Ȧ���Դϴ�."); //if��
	//}
	//else {
	//	printf("�Է��� ������ ¦���Դϴ�.");
	//}

	//3��

	//int age = 0;
	//printf("���̸� �Է��ϼ��� : ");
	//scanf_s("%d", &age);

	//if (age < 65 && age >= 19) {
	//	printf("��� : 1250��");
	//}
	//else if (age<19&&age >= 13) {
	//	printf("��� : 900��");
	//}
	//else if (age<13&&age >= 6) {
	//	printf("��� : 500��");
	//}
	//else { printf("��� : ����"); }
	//}

	//4��

	int kor = 88, eng = 90, math = 58, soc = 81, sic = 72;
	int aver = (kor + eng + math + soc + sic) / 5;
	char grade = ' ';

	switch(aver/10){
	case 9:
		//printf("A");
		grade = 'A';
		break;
	case 8:
		//printf("B");
		grade = 'B';
		break;
	case 7:
		//printf("C");
		grade = 'C';
		break;
	case 6:
		//printf("D");
		grade = 'D';
		break;
	default :
		//printf("F");
		grade = 'F';
	}
	printf("������ %c�Դϴ�.", grade);
}