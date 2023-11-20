#include<stdio.h>
void main() {

	int num = 0;

	printf("복숭아의 개수는 : ");
	scanf_s("%d", &num);

	//num%10==0 ? printf("필요한 바구니의 수: %d",num/10):printf("필요한 바구니의 수 : %d", num / 10 + 1);

	printf("필요한 바구니의 수 : %d", num%10 == 0 ? num/10 : num/10 + 1);

	return 0;


}