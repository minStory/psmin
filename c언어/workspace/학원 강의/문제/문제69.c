#include<stdio.h>
#include<string.h>
void main() {
	char grade = ' ';
	scanf_s("%c", &grade);

	grade == 'A' ? printf("best!!!") : 
		grade == 'B' ? printf("good!!") : 
		grade == 'C' ? printf("run!") : 
		grade == 'D' ? printf("slowly~") : printf("what?");

}