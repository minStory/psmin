#include<stdio.h>
#include<string.h>
void main() {
	int month = 0;
	scanf_s("%d", &month);
	
	month >= 13 || month <= 0 ? 0 :
		month >= 12 ? printf("winter") :
		month >= 9 ? printf("fall") :
		month >= 6 ? printf("summer") :
		month >= 3 ? printf("spring") :
		month >= 1 ? printf("winter") : 0;
		

}