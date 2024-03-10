#include<stdio.h>
void main() {
	//2번

	//int num = 0;

	//printf("정수를 입력하세요 : ");
	//scanf_s("%d", &num);
	//
	//printf(num % 2 ? "입력된 정수는 홀수입니다." : "입력된 정수는 짝수입니다."); //삼항연산자
	// 
	//if (num % 2) {
	//	printf("입력한 정수는 홀수입니다."); //if문
	//}
	//else {
	//	printf("입력한 정수는 짝수입니다.");
	//}

	//3번

	//int age = 0;
	//printf("나이를 입력하세요 : ");
	//scanf_s("%d", &age);

	//if (age < 65 && age >= 19) {
	//	printf("요금 : 1250원");
	//}
	//else if (age<19&&age >= 13) {
	//	printf("요금 : 900원");
	//}
	//else if (age<13&&age >= 6) {
	//	printf("요금 : 500원");
	//}
	//else { printf("요금 : 무료"); }
	//}

	//4번

	int kor = 88, eng = 90, math = 58, soc = 81, sic = 72;
	int aver = (kor + eng + math + soc + sic) / 5;
	char grade = ' ';

	switch(aver/10){
	case 9:
		//printf("A");
		grade = 'A';
		break;
	case 8:
		//printf("B");
		grade = 'B';
		break;
	case 7:
		//printf("C");
		grade = 'C';
		break;
	case 6:
		//printf("D");
		grade = 'D';
		break;
	default :
		//printf("F");
		grade = 'F';
	}
	printf("학점은 %c입니다.", grade);
}