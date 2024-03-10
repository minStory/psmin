#include<stdio.h>
void main() {
	int n = 0, m = 0;	//환자 수, 관계 수 선언
	int* a = 0;			//a열 선언
	int* b = 0;			//b열 선언

	scanf_s("%d %d", &n, &m);

	a = (int*)calloc(m, sizeof(int));	//a,b열 m만큼 동적할당
	b = (int*)calloc(m, sizeof(int));

	for (int i = 0; i < m; i++) {			//a,b열 환자 입력
		scanf_s("%d %d", a+i, b + i);
	}

	//a와 b배열 나열 후 확인
	//printf("\n");	
	//for (int i = 0; i < m; i++) {
	//	printf("%-2d ", a[i]);
	//}
	//printf("\n");
	//for (int i = 0; i < m; i++) {
	//	printf("%-2d ", b[i]);
	//}

	int cycle = 0;		//반복 횟수 선언
	int maxCnt = 0;		//최대 치료 가능한 환자 수 선언
	int maxPerson = 0;		//최대 치료 가능한 환자 번호 선언
	while (cycle != m) {		//m만큼 반복
	int cnt = 0;				//반복할때마다 0으로 초기화
	for (int i = 0; i < m; i++) {
		a[cycle] == a[i] || a[cycle] == b[i] ? cnt++ : cnt;	//같은 행의 a,b열환자가 다른 행에 있다면 cnt++
		b[cycle] == a[i] || b[cycle] == b[i] ? cnt++ : cnt;
		if (maxCnt < cnt) {		//cnt가 최대cnt보다 클 때
			maxCnt = cnt;		//최대cnt에 cnt를 대입
			maxPerson = a[i] <= b[i] ? a[i] : b[i];		//낮은 번호 환자를 대입
		}
	}
		cycle++;
	}
	printf("%d %d", maxPerson, maxCnt);

}