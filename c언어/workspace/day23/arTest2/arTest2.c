#include<stdio.h>
void main() {
	//1~100까지 배열에 담은 후 홀수만 출력
	//int arData[100] = { 0, };
	//
	//for (int i = 0; i < 100; i++) {
	//	arData[i] = i + 1;
	//	if (arData[i] % 2 == 1) {
	//		printf("%d ", arData[i]);
	//	}
	//}

	//1~100까지 배열에 담은 후 짝수의 합 출력
	//int arData[100] = { 0, };
	//int sum = 0;

	//for (int i = 0; i < 100; i++) {
	//	arData[i] = i + 1;
	//	if (arData[i] % 2 == 0) {
	//		sum += arData[i];
	//	}
	//}
	//	printf("%d", sum);

	//A~F까지 중 C 제외하고 배열에 담은 후 출력
	//char arData[5] = { ' ', };

	//for (int i = 0; i < 5; i++) {
	//	arData[i] = i > 1 ? 66 + i : 65 + i;
		//arData[i] = 65 + i;
		//if (i > 1) {
		//	arData[i]++;
		//}
	//printf("%c ", arData[i]);
	//}

	//5개의 정수를 입력받고 최대값과 최소값 구하기
	//int arData[5] = { 0, };
	//	int max = 0;
	//	int min = 0;

	//for (int i = 0; i < 5; i++) {
	//	printf("%d번째 정수 : ",i+1);
	//	scanf_s("%d", arData + i);
	//	}

	//max = arData[0];
	//min = arData[0];

	//for (int i= 1; i < 5; i++) {
	//	if (max < arData[i]) { max = arData[i]; }
	//	if (min > arData[i]) { min = arData[i]; }
	//}
	//printf("최대값은 %d이고, 최소값은 %d입니다.", max, min);
	
	//aBcDeFgHiJkLmNoPqRsTuVwXyZ 배열에 담기
	//int arData[26] = { 0, };
	char arData[26] = { ' ',};

	for (int i = 0; i < 26; i++) {

	arData[i] = i % 2 == 0 ? 97 + i : 65 + i;

		//arData[i] = i;
		//if (i % 2 == 0){
		//	arData[i] = i + 97; 
		//}
		//else {
		//	arData[i] = i + 65;
		//}
	printf("%c", arData[i]);
	}



}