#include<stdio.h>
void main(){

	int num = 1, multi=1;

	scanf_s("%d", &num);
	
		for (int i = num; i > 0; i--) {
			multi *= i;
		}
		// 작아지는 것
		
		//for (int i = 1; i <= num; i++) {
		//	multi *= i;
		//}
		// 커지는 것

	printf("%d", multi);

	return 0;

	
}
