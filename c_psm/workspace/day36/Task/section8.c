#include<stdio.h>
void main() {
	
	//int n = 0;
	//int i = 0;
	//int sum = 0;

	//printf("������ �Է��ϼ��� : ");
	//scanf_s("%d", &n);

	//while (i < n) {
	//	sum += i+1;
	//	i++;
	//}
	//printf("1���� %d������ ���� %d�Դϴ�.", n, sum);

	//2��

	//int num = 0;

	//for (int i = 1; i <= 100; i++) {
	//	if (i % 6 == 0) { printf("%d ", i ); }
	//}

	//3��

	int num = 0;
	
	while(1) {
		printf("�Է��ϼ��� : ");
		scanf_s(" %c", &num);
		//num = _getch();				//enterŰ �ȹ޴� �Է� �Լ�

		 if (num>=65 && num<=90) {
			printf("%c �Է��߽��ϴ�. �����մϴ�.\n", num); break; }

		printf("%c �Է��߽��ϴ�.\n", num);
		}
}

