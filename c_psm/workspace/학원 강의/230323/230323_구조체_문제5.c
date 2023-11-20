//입체기동장치 생산공장에서는 거인들을 물리치기 위한 기계가 생산되고 있습니다.
//이 공장을 운영하는 에렌은 입체기동장치(1~100)의 식별번호(1~100)와 가스 보유량(0~10000)을 같이 관리하려고 합니다.
//하지만, 식별번호를 정렬할 때 가스 보유량이 뒤죽박죽 되어 버려 골머리를 앓고 있습니다.
//에렌을 남몰래 좋아하고 있던 미카사는 에렌이 스트레스성 탈모로 잔머리가 모두 빠지기 전에 이 문제를 해결해주려 합니다.
//미카사가 에렌의 스트레스성 탈모를 막을 수 있도록 프로그램을 작성해세요.
//식별번호가 한번 정해지면 그 입체기동장치의 가스 보유량은 정렬되더라도 변하지 않아야 합니다.
//
//입력
//첫째 줄에 입체기동장치의 갯수 n이 입력된다. (1 <= n <= 100)
//둘째 줄부터 n + 1째 줄까지 각 줄에 입체기동장치의 식별번호 a와 가스 보유량 b가 주어진다.
//a는 중복 될 수 없지만 b는 중복될 수 있다. (1 <= a <= 100), (0 <= b <= 10, 000)
//
//출력
//첫째 줄부터 n번째 줄까지 각 줄에 식별번호를 오름차순으로 정렬해 가스 보유량과 같이 출력한다.
//
//입력 예시
//3
//2 10
//3 20
//1 30
//
//출력 예시
//1 30
//2 10
//3 20

#include<stdio.h>
#include<string.h>
#include<stdlib.h>
typedef struct num
{
	int n;
	int a[100];
	int b[100];
}N;

void main() {

	N num = 0;
	N fac[100];
	

	scanf_s("%d", &num);
	
	for (int i = 0; i < num; i++) {
		scanf_s("%d %d", &fac[i].a, &fac[i].b);
	}
	int temp = 0;
	for (int i = 0; i < num - 1; i++) {
		for (int j = i + 1; j < num; j++) {
			if (fac[i].a < fac[i].b) {
				temp = fac[i].a;
				fac[i].a = fac[i].b;
				fac[i].b = temp;
				temp = fac[i].b;
				fac[i].b = fac[i].a;
				fac[i].a = temp;
			}
		}
		for (int i = 0; i < num; i++) {
			printf("%d %d\n", fac[i].a, fac[i].b);
		}
	}



	//int n = 0;
	//int* a = 0;
	//int* b = 0;

	//scanf_s("%d", &n);
	//a = (int*)calloc(n, sizeof(int));
	//b = (int*)calloc(n, sizeof(int));

	//for (int i = 0; i < n; i++) {
	//	scanf_s("%d %d", &a[i], &b[i]);
	//}
	//int temp = 0;
	//for (int i = 0; i < n - 1; i++) {
	//	for (int j = i + 1; j < n; j++) {
	//		if (b[i] < b[j]) {
	//			temp = b[i];
	//			b[i] = b[j];
	//			b[j] = temp;
	//			temp = a[i];
	//			a[i] = a[j];
	//			a[j] = temp;				
	//		}
	//	}
	//}
	//	for (int i = 0; i < n; i++) {
	//		printf("%d %d\n", a[i], b[i]);
	//}
}