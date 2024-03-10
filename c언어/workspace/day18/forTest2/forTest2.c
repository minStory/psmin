#include<stdio.h>
void main() {
	//0 1 2 0 1 2 0 1 2 출력
	//0 1 2 3 4 5 6 7 8 : i
	//범위 -> %연산자 생각
	//n % a : 0 ~ a-1 모듈러스

	for (int i = 0; i < 9; i++) {
		printf("%d ", i % 3);

	}

	//aBcDeFgHiJkLmNoPqRsTuVwXyZ
	// 아스키코드 A : 65, a : 97

	for (int i = 0; i < 26; i++) {
		printf("%c ", i % 2 == 0 ? 97 + i : 65 + i);

	}

}