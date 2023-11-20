#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h>

typedef struct _student {
	char name[10];
	int a;         //첫 번째 과목 점수
	int a_rank;   // 첫 번째 과목 등수 
	int b;         //두 번째 과목 점수
	int b_rank;   // 두 번째 과목 등수
	int c;         //세 번째 과목 점수
	int c_rank;   // 세 번째 과목 등수

}student;

int main(void) {
	int n;
	student s[100];
	scanf("%d", &n);

	for (int i = 0; i < n; i++)
		scanf("%s %d %d %d", s[i].name, &s[i].a, &s[i].b, &s[i].c);

	/*첫 번째 과목으로 정렬*/
	for (int i = n - 1; i > 0; i--) {
		for (int j = 0; j < i; j++) {
			if (s[j].a < s[j + 1].a) {
				student tmp = s[j];
				s[j] = s[j + 1];
				s[j + 1] = tmp;
			}
		}
	}
	/*1등 등수*/
	s[0].a_rank = 1;

	/*두번째 과목으로 정렬*/
	for (int i = n - 1; i > 0; i--) {
		for (int j = 0; j < i; j++) {
			if (s[j].b < s[j + 1].b) {
				student tmp = s[j];
				s[j] = s[j + 1];
				s[j + 1] = tmp;

			}
		}
	}
	/*정렬된 순으로 점수를 등수로 바꿔주기*/
	int cnt;
	for (int i = 0; i < n; i++) {
		if (i > 0 && s[i - 1].b == s[i].b)  //같은 등수 처리
			s[i].b_rank = cnt;
		else {
			cnt = i + 1;
			s[i].b_rank = cnt;
		}
	}
	/*세번째 과목으로 정렬*/
	for (int i = n - 1; i > 0; i--) {
		for (int j = 0; j < i; j++) {
			if (s[j].c < s[j + 1].c) {
				student tmp = s[j];
				s[j] = s[j + 1];
				s[j + 1] = tmp;

			}
		}
	}
	/*정렬된 순으로 점수를 등수로 바꿔주기*/
	cnt = 1;
	for (int i = 0; i < n; i++) {
		if (i > 0 && s[i - 1].c == s[i].c) {  //같은 등수 처리
			s[i].c_rank = cnt;

		}
		else {
			cnt = i + 1;
			s[i].c_rank = cnt;
		}
	}
	/*출력*/
	for (int i = 0; i < n; i++) {
		if (s[i].a_rank == 1) {
			printf("%s %d %d\n", s[i].name, s[i].b_rank, s[i].c_rank);

		}

	}
	return 0;
}


//정종진님
#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>

typedef struct Score {
	char name[20];
	int kor;
	int eng;
	int math;
}S;
int main(void) {
	S info[100];

	int n;
	printf("학생 수를 입력하세요 >> ");
	scanf("%d", &n);

	printf("학생이름과 과목 점수 입력 >> \n");
	for (int i = 0; i < n; i++) {
		scanf("%s %d %d %d", info[i].name, &info[i].kor, &info[i].eng, &info[i].math);
	}

	for (int i = 0; i < n; i++) {
		for (int j = 0; j < i; j++) {
			if (info[i].kor > info[j].kor) { //첫번째 성적순 정렬
				S temp = info[i];
				info[i] = info[j];
				info[j] = temp;
			}
		}
	}


	S temp = info[0]; //빈 구조체 하나 생성해서 첫번째 성적 1등인 학생 정보 입력.	


	for (int i = 0; i < n; i++) {
		for (int j = 0; j < i; j++) {
			if (info[i].eng > info[j].eng) { //두번째 성적순 정렬
				S temp = info[i];
				info[i] = info[j];
				info[j] = temp;
			}
		}
	}
	for (int i = 0; i < n; i++) { //두번째 성적순으로 나열후 저장해둔값과 동일한 사람의 인덱스 번호 추출
		if (info[i].kor == temp.kor) {
			temp.eng = i + 1;
		}
	}

	for (int i = 0; i < n; i++) {
		for (int j = 0; j < i; j++) {
			if (info[i].math > info[j].math) { //세번째 성적순 정렬
				S temp = info[i];
				info[i] = info[j];
				info[j] = temp;
			}
		}
	}
	for (int i = 0; i < n; i++) {	//세번째 성적순으로 나열후 저장해둔값과 동일한 사람의 인덱스 번호 추출
		if (info[i].kor == temp.kor) {
			temp.math = i + 1;
		}
	}

	printf("\n결과 : %s %d %d\n", temp.name, temp.eng, temp.math);


	return 0;
}