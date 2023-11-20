#include<stdio.h>

void function(int*);

void main() {
	int data = 10;
	function(&data);
	printf("%d", data);
}

void function(int* pData) {
	*pData = 20;


}