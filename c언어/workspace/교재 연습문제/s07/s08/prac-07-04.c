#include<stdio.h>
void main() {
	int a = 0,b=0,c=0,d=0,e=0, aver=0;

	printf("국 영 수 사 과 각 과목의 점수를 차례로 기입하세요.\n");
	scanf_s("%d %d %d %d %d", &a, &b, &c, &d, &e);

	aver = (a + b + c + d + e) / 5;
	
	printf("평균 점수는 %d점이며,\n", aver);


	switch(aver/10)
	{
	case 10:
	case 9:
		printf("평균 학점은 A등급 입니다.");
		break;
	case 8:
		printf("평균 학점은 B등급 입니다.");
		break;
	case 7:
		printf("평균 학점은 C등급 입니다.");
		break;
	case 6 :
		printf("평균 학점은 D등급 입니다.");
		break;
	default:
		printf("평균 학점은 F등급 입니다.");
		break;

	}
	return 0;



}