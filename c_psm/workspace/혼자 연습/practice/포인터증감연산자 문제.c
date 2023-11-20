#include <stdio.h>

int main()
{
	int* ptr;

	int n[] = { 5,10,22,34,36,44 };

	ptr = n;


	printf("%d ", *ptr++);  printf("%d\n", *ptr);		//5 , 10

	printf("%d ", *ptr + 1); printf("%d\n", *ptr);		//11 , 10

	printf("%d ", ++ * ptr);  printf("%d\n", *ptr);		//11 , 11

	printf("%d ", *(ptr + 1)); printf("%d\n", *ptr);		//22 , 11

	printf("%d ", *ptr += 1);  printf("%d\n", *ptr);	//12 , 12

	printf("%d ", *++ptr);  printf("%d\n", *ptr);		//22 , 22

	printf("%d ", (*ptr)++); printf("%d\n", *ptr);		//22 , 23
}