#include<stdio.h>
void main() {//피보나치 수열

	int before = 1, between = 1, next =1 ,n=0;	//이전값, 현재값, 다음값, 개수 선언
	printf("피보나치 수열 출력 개수 : ");
	scanf_s("%d", &n);

	for (int i = 0; i < n; i++) {	//개수만큼 반복
		printf("%d ", between);	//현재값을 출력
		before=between;	//이전값을 현재값으로 변경
		between = next;	//현재값을 다음값으로 변경
		next = before + between; //다음값을 이전값+현재값으로 변경
	}
}