#include<stdio.h>	
void main() {
	
	int num;

	printf("너의 점수는 몇점이야? ");
	scanf_s("%d", &num);


	//조건식 위치에 쉼표 금지(&,^ etc.)//
	if (100>=num&num>=90)
	{
		printf("Exelent");
	}
		else if (num >=80)
	{
		printf("Great");
	}
		else if (num >= 70)
	{
		printf("Good");
	}
		else if (num >= 60)
	{
		printf("Bad");
	}
		else
	{
		printf("Trash");
	}

	return 0;



}