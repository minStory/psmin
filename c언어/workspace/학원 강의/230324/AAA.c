#include<stdio.h>

int main(int argc, char* argv[]) {
	int i;
	printf("HelloWorld!!!!!\n");
	printf("argc = %d\n", argc);
	
	for (int i = 0; i < argc; i++) {
		printf("argv[%d] = %s\n", i, argv[i]);
	}

}