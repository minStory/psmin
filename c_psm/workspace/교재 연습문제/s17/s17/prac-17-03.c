#include<stdio.h>

//�Լ��� �����
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