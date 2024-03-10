#include<stdio.h>
int fac(int i) {
	if (i ==1) {	//i가 1일때는 더이상 재귀하지 않음
		return 1;
	}
	else { 
		return i * fac(i - 1); }		//i가 1이되기 전까지 계속 함수를 재귀
}

void main() {
	int i = 0;
	scanf_s("%d", &i);
	printf("%d",fac(i));

}