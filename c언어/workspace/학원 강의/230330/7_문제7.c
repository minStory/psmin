//길이가 6인 int형 배열 arr을 선언하고 이를 1 2 3 4 5 6 초기화 하고 배열에 저장된 값의 순서가ㅣ 6 5 4 3 2 1 이 되도록 변경해보세요~
//(배열의 앞과 뒤를 가리키는 포인터 변수 두 개 선언해서 횔용해서 풀어보기)
#include<stdio.h>
void main() {
	int arr[6] = { 1,2,3,4,5,6 };
	int* start = arr;
	int* end = arr + 5;

	int temp = 0;
	for (int i = 0; i < 3; i++) {
		temp = *(start + i);
		*(start + i) = *(end - i);
		*(end - i) = temp;
	}
	for (int i = 0; i < 6; i++) {
		printf("%d ", arr[i]);
	}

}