#include<stdio.h>
void main(){

	int num = 1, multi=1;

	scanf_s("%d", &num);
	
		for (int i = num; i > 0; i--) {
			multi *= i;
		}
		// �۾����� ��
		
		//for (int i = 1; i <= num; i++) {
		//	multi *= i;
		//}
		// Ŀ���� ��

	printf("%d", multi);

	return 0;

	
}
