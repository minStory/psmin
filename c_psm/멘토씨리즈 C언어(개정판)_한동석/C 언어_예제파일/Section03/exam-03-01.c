#include <stdio.h>

int main(void) 
{
	char cnum = 128; // char 형의 최대값은 127입니다. 
	unsigned char u_cnum = 128;
	short snum = 32768; // short 형의 최대값은 32767입니다. 
	unsigned short u_snum = 32768;
	
	printf("%d\n", cnum);
	printf("%d\n", u_cnum);
	printf("%d\n", snum);
	printf("%d\n", u_snum);
	
	return 0;
}