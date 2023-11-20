#include <stdio.h> 

// 함수의 선언부
int FirstFunc(int a, int b); 
double SecondFunc(double d); 
void ThirdFunc(char * c);

int main(void)
{
    int (*first)(int, int);
    double (*second)(double);
    void (*third)(char*);
    
    first = FirstFunc; 
    second = SecondFunc; 
    third = ThirdFunc;

    return 0; 
}

// 함수의 정의부
int FirstFunc(int a, int b)
{ 
    return 0; 
} 
double SecondFunc(double d)
{
    return 0.0;
} 
void ThirdFunc(char * c)
{
    return;
}