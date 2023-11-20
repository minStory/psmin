#include<stdio.h>
void main() {


	int num = 0, i=0, sum=0;

	printf("정수를 입력하세요 : ");
	scanf_s("%d", &num);

	while (i < num) {
		i++;
		sum += i;
	}
	printf("1부터 %d까지의 합은 %d입니다.", num, sum);


}


