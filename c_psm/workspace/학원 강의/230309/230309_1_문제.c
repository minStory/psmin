#include<stdio.h>
void main() {

	int student[31] = { 0, }; //학생수
	int num = 0;

	for (int i = 0; i < 28; i++) { //입력
		scanf_s("%d", &num);
		student[num] = num;		// 제출한 사람 번호 대입
	}
	for (int i = 1; i < 31; i++) { //제출하지 않은 사람 값 0 출력
		if (student[i] == 0) { printf("제출하지 않은 사람 : %d\n", i); }
	}
}
//코드업 1430번 문제

//#include<stdio.h>
//void main() {
//	int n = 0, m = 0;
//	int a = 0, b = 0;
//	int N[1000] = { 0 };
//	int M[1000] = { 0 };
//	scanf_s("%d", &n);
//	for (int i = 0; i < n; i++) {
//		scanf_s("%d", &a);
//		N[a] = a;
//	}
//	scanf_s("%d", &m);
//	for (int i = 0; i < m; i++) {
//		scanf_s("%d", &b);
//		M[b] = b;
//		if (M[b] == N[b]) {
//			printf("1 ");
//		}
//		else if (M[b] > N[b]) {
//			printf("0 ");
//		}
//	}
//}


