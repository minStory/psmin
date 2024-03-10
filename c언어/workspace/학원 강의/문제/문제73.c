#include<stdio.h>
#include<string.h>
void main() {
	int a = 0;
	scanf_s("%d", &a);
	while (a != 0) {
		printf("%d\n",a);
		scanf_s("%d",&a);
	}

}