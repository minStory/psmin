#include<stdio.h>
void main() {
	int n = 0;
	printf("n을 입력하세요 : ");
	scanf_s("%d", &n);
	int result = recursiveSum(n);
	printf("!부터 n까지의 합 : %d\n",result);
}
int recursiveSum(int n) {
	//int sum = 0;
	//for (int i = 1; i <= n; i++) {
	//	sum += i;
	//}
	//return sum;
	//if (n >0){ return n + recursiveSum(n - 1); }
	//else { return 0; }

	return n > 0 ? n + recursiveSum(n - 1) : 0;
}