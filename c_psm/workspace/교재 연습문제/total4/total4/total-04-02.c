#include<stdio.h>
#include<stdlib.h>
#include<time.h>
void main() {
	srand(time(NULL));
	int ranNum = rand();
	int choice = 0;

	printf("난수를 맞춰보세요(1~10) 사이 : ");
	scanf_s("%d", &choice);

	if (ranNum == choice) { printf("정답입니다. 프로그램을 종료합니다.\n"); }	//시작부터 정답일 때

	while (ranNum!=choice) {	//정답이 아닐 때 반복문 진입
		ranNum = rand();		//난수를 대입해 값을 변경해준다
		while (ranNum%= 11) {		//난수가 11로 나눈 나머지가 아닐 때 (0~10이 아닐 때) 반복문 진입
			if (ranNum == choice) {		//정답일 때 출력 후 종료
				printf("정답입니다. 프로그램을 종료합니다.\n");
				break;
			}
			else {		//정답이 아닐 때 출력 후 재입력 -> 반복문 재진입
				printf("틀렸습니다. 재시도!\n");
				scanf_s("%d", &choice);
			}
		}
	}

	//while (ranNum < 0 || ranNum>10) {	//난수가 0과 10사이에 들어오지 않을때 while문 진입
	//	ranNum = rand();	//0과 10사이에 들어올 때 까지 반복
	//	while (ranNum >= 0 && ranNum <= 10) {	//난수가 0과 10사이에 들어올 때 중복while문 진입
	//		if (ranNum == choice) {	//난수와 변수가 같을 때 출력 -> 종료
	//			printf("정답입니다. 프로그램을 종료합니다.\n");
	//			break;
	//		}
	//		else {	//난수와 변수가 다를 때 출력 -> 변수 재입력 -> while문 반복
	//			printf("틀렸습니다. 재시도!\n");
	//			scanf_s("%d", &choice);
	//		}
	//	}
	//}
}