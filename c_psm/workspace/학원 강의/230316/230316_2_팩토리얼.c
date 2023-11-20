#include<stdio.h>
int fac(int num) {
	
	
	if (num == 1) {
		return 1;
	}
	else { return num* fac(num-1); }

}

void main() {
	
	int a = 0;
	printf("%d",fac(5));
	

}