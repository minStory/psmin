#include<stdio.h>
#include<stdlib.h>
#include<time.h>		//srand�Լ��� �Բ� ���
void main() {
	int ranNum = 0;
	
	//for (int i = 0; i < 5; ) {
	//		ranNum = rand();
	//	if (ranNum >= 0 && ranNum <= 10) {
	//		printf("%d\n", ranNum);
	//		i++;
	//	}
	//}
	srand(time(NULL));	//rand�� ������ ����ؼ� ��������ִ� ����
	for (int i = 0; i < 5; i++) {
		ranNum = rand() % 11;
		printf("%d\n", ranNum);
	}
}