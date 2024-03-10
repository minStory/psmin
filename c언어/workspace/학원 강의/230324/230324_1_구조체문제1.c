//문제 설명
//세종이는 정보과학 선생님인JH를도와주기 위해 정보과학 성적처리 프로그램을 만들기로 했다.
//선생님은 특정 과목에서 1등한 학생이 다른 과목에서는 어떤 성적을 얻었는지 관심이 많다.
//다음 조건을 만족하는 프로그램을 작성해 보자.
//
//입력
//첫째 줄에 데이터의 개수
//n(3 <= n <= 100)
//
//둘째 줄부터 n + 1줄에 학생 이름과
//3과목 점수들이 공백으로 구분되어 입력된다. (입력 예시 참고)
//
//단 이름의 길이는 최대
//10바이트 이내이다
//
//출력
//첫 번째 과목을
//1등한 학생의 이름과 두 번째, 세 번째 과목의 석차를 공백으로 구분하여 출력한다.
//
//단 첫 번째 과목의
//1등은
//1명이라고 가정한다.
//
//입력 예시
//4
//Jeon 95 80 100
//Kim 59 85 75
//Lee 90 100 75
//Bae 100 82 80
//
//출력 예시
//Bae 3 2

#include<stdio.h>
typedef struct School
{
	char name[10];
	int fir;
	int sec;
	int thi;
}S;

void main() {
	int n = 0;
	S* emp = 0;

	scanf_s("%d", &n);	

	emp = (int*)calloc(n, sizeof(int));

	for(int i=0;i<n;i++){
		scanf_s("%s", emp->name,sizeof(emp->name));
		scanf_s("%d", &emp->fir);
		scanf_s("%d", &emp->sec);
		scanf_s("%d", &emp->thi);
	}
	//int firMax = 0;
	//char firMaxName = "";
	//int theSec = 0;
	//int theThi = 0;
	S temp;
	for (int i = 0; i < n - 1; i++) {
		for (int j = i + 1; j < n; j++) {
			if (emp[i].fir < emp[j].fir) {
				temp = emp[i];
				emp[i] = emp[j];
				emp[j] = temp;
			}
		}
	}
	for (int i = 0; i < n; i++) {
		if()
	}


	printf("%s", emp[0].name);
	printf("%d", emp[0].fir);

}








