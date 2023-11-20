#include<stdio.h>
#include<stdlib.h>
void main() {
	//정적 할당
	int N = 0, ref = 0, cnt = 0; // 개수, 기준, 카운트
	int arData[100] = { 0, }; // 반복할 수열

	//동적 할당
	int n;
	int* arr;
	scanf_s("%d", &n);
	arr = (int*)malloc(sizeof(int) * n);


	scanf_s("%d", &N);

	for (int i = 0; i < N; i++) {
		scanf_s("%d", &arData[i]);
	}

	scanf_s("%d", &ref);

	for (int j = 0; j < N; j++) {
		if (arData[j] == ref) {
			cnt++;
		}

	}
	printf("%d", cnt);

}