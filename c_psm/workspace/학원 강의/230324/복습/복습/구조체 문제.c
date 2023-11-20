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
typedef struct School		//구조체 선언
{
	char name[10];
	int aSub;
	int bSub;
	int cSub;
}S;

void main() {
	S* abc = 0;			//구조체 포인터변수 선언
	int n = 0;				//학생 수 선언

	scanf_s("%d", &n);		//학생 수 입력
	abc = (S*)calloc(n , sizeof(S));		//학생 수 만큼 동적 할당

	for (int i = 0; i < n; i++) {		//학생 이름 및 과목 점수 입력
		scanf_s("%s", abc[i].name, sizeof(abc[i].name));
		scanf_s("%d %d %d", &abc[i].aSub, &abc[i].bSub, &abc[i].cSub);
	}
	S* temp = 0;							//임시 변수 선언
	temp = (S*)calloc(n, sizeof(S));		//임시 변수 동적할당
	for (int i = 0; i < n-1; i++) {	//첫번째과목 1등 기준으로 내림차순 정렬
		for (int j = i + 1; j < n; j++) {
			if (abc[i].aSub < abc[j].aSub) {
				S temp = abc[i];
				abc[i] = abc[j];
				abc[j] = temp;
			}
		}
	}
	int bRank = 1;		//두번째과목 석차 선언
	int cRank = 1;		//세번째과목 석차 선언
	for (int i = 0; i < n; i++) {									//1등 학생의 모든 점수는 [0]번방에 있으므로
		abc[i].bSub > abc[0].bSub ? bRank++ : bRank;		//다른학생[i]의 두번째과목이 [0]번방보다 높을 때 bRank++ 반복
		abc[i].cSub > abc[0].cSub ? cRank++ : cRank;		//다른학생[i]의 세번째과목이 [0]번방보다 높을 때 cRank++ 반복
	}
	printf("%s %d %d", abc[0].name, bRank, cRank);		//출력

	free(temp);		//동적할당 해제
	free(abc);	
}