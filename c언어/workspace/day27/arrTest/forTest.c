#include<stdio.h>
void main() {

	//�ݺ����� �� ���� ����ؼ� ������ 1~9�� ���

	//for (int i = 0; i < 81; i++) {
	//	printf("%d * %d = %d\n", i / 9+1 , i % 9+1 , (i / 9+1 ) * (i % 9+1 ));
	//}

	for (int i = 1; i < 10; i++) {
		for (int j = 1; j < 10; j++) {
			printf("%d * %d = %2d \n", i, j, i * j);
		}
	}

}