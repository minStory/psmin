#include<stdio.h>
void main() {
	
	//int n = 0;
	//int i = 0;
	//int sum = 0;

	//printf("정수를 입력하세요 : ");
	//scanf_s("%d", &n);

	//while (i < n) {
	//	sum += i+1;
	//	i++;
	//}
	//printf("1부터 %d까지의 합은 %d입니다.", n, sum);

	//2번

	//int num = 0;

	//for (int i = 1; i <= 100; i++) {
	//	if (i % 6 == 0) { printf("%d ", i ); }
	//}

	//3번

	int num = 0;
	
	while(1) {
		printf("입력하세요 : ");
		scanf_s(" %c", &num);
		//num = _getch();				//enter키 안받는 입력 함수

		 if (num>=65 && num<=90) {
			printf("%c 입력했습니다. 종료합니다.\n", num); break; }

		printf("%c 입력했습니다.\n", num);
		}
}

