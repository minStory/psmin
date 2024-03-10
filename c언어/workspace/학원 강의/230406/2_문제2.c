//나이 차이
//N(2 <= N <= 100)명의 나이가 입력됩니다.이 N명의 사람 중 가장 나이차이가 많이 나는 경우는
//최대 나이 차이를 출력하는 프로그램을 작성하세요
//입력 설명 : 첫 줄에 자연수 N(2 <= N <= 100)이 입력 되고 그 다음 줄에 N개의 나이가 입력된다.
//출력 설명 : 첫 줄에 최대 나이 차이를 출력한다.
#include<stdio.h>
void main() {
	int n = 0, age = 0, max = 0, min = 999;
	scanf_s("%d", &n);

	for (int i = 0; i < n; i++) {
		scanf_s("%d", &age);
		if (max < age) { max = age; }
		if (min > age) { min = age; }
	}
	printf("%d", max - min);
}