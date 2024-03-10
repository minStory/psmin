#include<stdio.h>	
void main() {

	int d = 0;

	printf("정수를 입력하세요 : ");
	scanf_s("%d", &d);

	if (d % 2== 0) {
		printf("입력한 정수는 짝수입니다.");
	}
	else if (d%2==1){
		printf("입력한 정수는 홀수입니다.");
	}
	else {
		printf("다시 입력해 주세요.");
	}
		return 0;


}