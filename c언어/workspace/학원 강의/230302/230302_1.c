#include<stdio.h>
#include<stdlib.h>
#include<time.h>

void main() {


		//별트리
	//	int count = 0;
	//
	//	scanf_s("%d", &count);
	//
	//	for (int i = 0; i < count; i++) {
	//		for (int j = count - 1; j > i; j--) {
	//			printf(" ");
	//		}
	//		for (int k = 0; k <= i; k++) {
	//			printf("*");
	//		}
	//		printf("\n");
	//
	//	}
	//}


		//역 별트리
	//	int count = 0;
	//
	//	scanf_s("%d", &count);
	//
	//	for (int i = 0; i < count; i++) {
	//		for (int j = 0; j < i; j++) {
	//			printf(" ");
	//		}
	//		for (int k = count; k > i; k--) {
	//			printf("*");
	//		}
	//		printf("\n");
	//
	//	}
	//}

	// 구구단
//	int num = 0;
//
//	printf("몇단 ? ");
//	scanf_s("%d", &num);
//
//	for (int i = 1; i < 10; i++) {
//		printf("%d * %d = %d\n", num, i, num * i);
//	}
//}


	//정수 a, b 받아 a부터 b까지의 합계 구하기
	int a = 0, b = 0;
	int sum = 0;

	printf("두 정수 입력 : ");
	scanf_s("%d %d", &a, &b);

	for (; a <= b; a++) {
		sum += a;
	}

	//for (int i = 0; i <= b - a; i++) {
	//	for (; a <= b; a++) {
	//		sum += a;
	//	}
	//}
	printf("합 : %d", sum);
}
 

	
	//	srand(time(NULL));
	//	int select;
	//	int pc_select = rand() % 3 + 1;
	//	printf("선택 1:가위, 2:바위, 3:보\n");

	//	scanf_s("%d", &select);

	//	printf("컴퓨터의 선택 : %d\n", pc_select);

	//	if (select == pc_select) {
	//		printf("비김\n");
	//	}
	//	else if (select == 1 && pc_select == 2 || select == 2 && pc_select == 3 || select == 3 && pc_select == 1) {
	//		printf("짐\n");
	//	}
	//	else {
	//		printf("이김\n");
	//	}

	//}