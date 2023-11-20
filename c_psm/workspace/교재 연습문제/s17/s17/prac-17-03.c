#include<stdio.h>

//함수의 선언부
int FirstFunc(int a, int b);
double SecondFunc(double d);
void ThirdFunc(char* c);

void main() {

	int (*first)(int, int);
	double(*second)(double);
	void(*third)(char*);



	first = FirstFunc;
	second = SecondFunc;
	third = ThirdFunc;
}