#include<stdio.h>
#include<stdlib.h>
#include<time.h>		//srand함수와 함께 사용
void main() {
	int ranNum = 0;
	
	//for (int i = 0; i < 5; ) {
	//		ranNum = rand();
	//	if (ranNum >= 0 && ranNum <= 10) {
	//		printf("%d\n", ranNum);
	//		i++;
	//	}
	//}
	srand(time(NULL));	//rand의 난수를 계속해서 변경시켜주는 역할
	for (int i = 0; i < 5; i++) {
		ranNum = rand() % 11;
		printf("%d\n", ranNum);
	}
}