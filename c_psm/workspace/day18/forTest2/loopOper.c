#include<stdio.h>
void main() {
	//1~10���� �� 4������ ����ϱ�
	//for (int i = 0; i < 10; i++) {
	//	printf("%d\n", i + 1);
	//	if (i == 3) {break;}
	//}

	//1~10���� �� 4�� �����ϰ� ����ϱ�
	for (int i = 0; i < 10; i++) {
		if (i == 3) { continue; }
		printf("%d\n", i + 1);

	}



}