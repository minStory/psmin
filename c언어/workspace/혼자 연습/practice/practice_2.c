#include<stdio.h>	
void main() {
	
	int num;

	printf("���� ������ �����̾�? ");
	scanf_s("%d", &num);


	//���ǽ� ��ġ�� ��ǥ ����(&,^ etc.)//
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