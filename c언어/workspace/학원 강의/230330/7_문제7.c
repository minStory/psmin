//���̰� 6�� int�� �迭 arr�� �����ϰ� �̸� 1 2 3 4 5 6 �ʱ�ȭ �ϰ� �迭�� ����� ���� �������� 6 5 4 3 2 1 �� �ǵ��� �����غ�����~
//(�迭�� �հ� �ڸ� ����Ű�� ������ ���� �� �� �����ؼ� Ȼ���ؼ� Ǯ���)
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