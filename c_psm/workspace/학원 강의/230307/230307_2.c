#include<stdio.h>
void main() {

	//int N = 0, num = 0, ref = 0, cnt=0;

	//scanf_s("%d", &N);

	//scanf_s("%d", &ref);

	//for (int i = 0; i < N; i++) {
	//	scanf_s("%d", &num);
	//	if (num == ref) { cnt++; }
	//}

	//printf("%d", cnt);

	int N = 0, ref = 0, cnt = 0;

	int arData[100] = { 0, };

	scanf_s("%d", &N);

	for (int i = 0; i < N; i++) {
		scanf_s("%d", arData);
	}

	scanf_s("%d", &ref);

	for (int j = 0; j < N; j++) {
		if (arData[j] == ref) {
			cnt++;
		}

	}
	printf("%d", cnt);
}