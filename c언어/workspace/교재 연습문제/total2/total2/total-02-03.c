#include<stdio.h>
void main() {
	int num = 2;	//2보다 큰수 선언
	int cnt = 0;	//출력할 개수 초기화

	while (cnt != 10) {	//출력할 개수 10개
		for (int i = 2; ; i++) {		//2부터 조건없이 계속 나누기 반복
			if (num == i) {	//num이 i로 나누어질때
				printf("%d ", num);	//출력
				cnt++;				//출력개수 1개 누적
				break;				//for문 탈출
			}
			else if (num % i == 0) {		//나누기를 반복하다가 중간값으로 나누어지면 for문 탈출
				break;
			}
		}
		num++;	//for문 탈출시 마다 num값 증가시키기
	}
}






















