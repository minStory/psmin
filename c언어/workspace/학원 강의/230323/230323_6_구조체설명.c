#include<stdio.h>
#include<string.h>
typedef struct 구조체이름
{
	자료형 변수명;
	자료형 변수명;

}구조체별칭;

struct score {
	char name[10];
	int kor;
	int mat;
	int eng;

}S;

void main() {
	//초기화 방법1 -> 선언 시 바로 초기화
	struct score s1 = { "가나다",50,40,70 };

	//초기화 방법2 -> 선언 후 .을 활용해서 초기화
	struct score s2;
	strcpy_s(s2.name, "라마바");
	s2.kor = 60;
	s2.mat = 70;
	s2.eng = 80;




}