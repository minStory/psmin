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
	int T = 0;
	int date = 0;
	int* yptr = 0;		//각 값 저장을 위해 포인터 선언&초기화
	int* mptr = 0;
	int* dptr= 0;

	scanf_s("%d", &T);

	yptr = (int*)calloc(T, sizeof(int));	//T의 개수를 알 수 없기 때문에 T만큼 동적할당 (각각 작성)
	mptr = (int*)calloc(T,sizeof(int));
	dptr = (int*)calloc(T,sizeof(int));

	for (int i = 0; i < T; i++) {		// T만큼 입력함수 한번에 받기
		scanf_s("%d", &date);
		*(yptr+i) = date / 10000;
		*(mptr+i) = date % 10000 / 100;	//인덱스를 증가시키면서 각 인덱스에 값 저장
		*(dptr+i) = date % 100;
	}

	printf("\n");
	for (int i = 0; i < T; i++) {		//T만큼 출력함수 한번에 반복
		printf("#%d ", i + 1);

		switch (*(mptr + i)){ //월의 값을을 기준으로 case 분리
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			if (dptr[i] >= 1 && dptr[i] <= 31) {
				printf("%.4d / %.2d / %.2d", yptr[i],mptr[i],dptr[i]); //배열은 포인터상수이므로 배열형식으로 사용 가능
			}
			else { printf("-1"); }
			break;

		case 4:
		case 6:
		case 9:
		case 11:
			if (dptr[i] >= 1 && dptr[i] <= 30) {
				printf("%.4d / %.2d / %.2d", yptr[i], mptr[i], dptr[i]);
			}
			else { printf("-1"); }
			break;

		case 2:
			if (dptr[i] >= 1 && dptr[i] <= 28) {
				printf("%.4d / %.2d / %.2d", yptr[i], mptr[i], dptr[i]);
			}
			else { printf("-1"); }
			break;
		default:
			printf("-1");
			break;
			}

		printf("\n");

		}
	}