//연월일 순으로 구성된 8자리의 날짜가 입력으로 주어진다.
//
//22220228  -- > 2222 / 02 / 28
//
//해당 날짜의 유효성을 판단한 후, 날짜가 유효하다면
//[그림1] 과 같이 ”YYYY / MM / DD”형식으로 출력하고,
//날짜가 유효하지 않을 경우, -1 을 출력하는 프로그램을 작성하라.
//연월일로 구성된 입력에서 월은 1~12 사이 값을 가져야 하며
//일은[표1] 과 같이, 1일 ~각각의 달에 해당하는 날짜까지의 값을 가질 수 있다.
//
//[입력]
//입력은 첫 줄에 총 테스트 케이스의 개수 T가 온다.
//다음 줄부터 각 테스트 케이스가 주어진다.
//
//[출력]
//테스트 케이스 t에 대한 결과는 “#t”을 찍고, 한 칸 띄고, 정답을 출력한다.
//(t는 테스트 케이스의 번호를 의미하며 1부터 시작한다.)
//
//입력
//5
//22220228
//20150002
//01010101
//20140230
//11111111
//
//출력
//#1 2222 / 02 / 28
//#2 - 1
//#3 0101 / 01 / 01
//#4 - 1
//#5 1111 / 11 / 11

#include<stdio.h>
void main() {
	int T = 0, all = 0;
	scanf_s("%d", &T);

	int year = 0, month = 0 , day = 0;
	year = all / 10000;
	month = all % 10000 / 100;
	day = all % 100;
	
	for (int i = 0; i < T; i++) {
		scanf_s("%d", &all);
		printf("#%d ", i+1);

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			if (day >= 1 && day <= 31) {
				printf("%.4d / %.2d / %.2d\n", year, month, day);
			}
			else { printf("-1\n"); }
			break;

		case 2:
			if (day >= 1 && day <= 28) {
				printf("%.4d / %.2d / %.2d\n", year, month, day);
			}
			else { printf("-1\n"); }
			break;

		case 4:
		case 6:
		case 9:
		case 11:
			if (day >= 1 && day <= 30) {
				printf("%.4d / %.2d / %.2d\n", year, month, day);
			}
			else { printf("-1\n"); }
			break;
		default:
			printf("-1\n");
			break;
		}
		printf("\n");
	}
}