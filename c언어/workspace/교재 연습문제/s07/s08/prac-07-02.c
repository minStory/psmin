#include<stdio.h>	
void main() {

	int d = 0;

	printf("������ �Է��ϼ��� : ");
	scanf_s("%d", &d);

	if (d % 2== 0) {
		printf("�Է��� ������ ¦���Դϴ�.");
	}
	else if (d%2==1){
		printf("�Է��� ������ Ȧ���Դϴ�.");
	}
	else {
		printf("�ٽ� �Է��� �ּ���.");
	}
		return 0;


}