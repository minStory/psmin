#include<stdio.h>
	
	int add(int a, int b)
	{
		return a + b;
	}
	int minus(int a, int b)
	{
		return a - b;
	}
	int multi(int a, int b)
	{
		return a * b;
	}
	int div(int a, int b) {
		return a / b;
	}

	int main(void)
	{ 
		int result;

		result = div (6, 3);
		printf("함수가 반환한 값 : %d\n", result);

		

		return 0;

	}


