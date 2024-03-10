#include<stdio.h>
//int a = 10;
//int b = 20;
//int c = 30;
//void func(void) {
//	static int a = 100;
//	int b = 200;
//	a++;
//	b++;
//	c = a;
//}

void main(){
	/*int n=0;
	scanf_s("%d\n", &n);
	char* str = (char*)calloc(n, sizeof(char));
	scanf_s("%[^\n]", str, 100);
	printf("%s\n", str);
	printf("%d\n", strlen(str));
	printf("%s\n", strrev(str));*/

	//int a = (10, 20, 30);
	//printf("%d", a);

	//double d_value = 556.1592;
	//printf("%7.5f", d_value);

	//int a = 3, b = 4, c = 5,d=12;
	//double  aa = 12;
	//printf("%3d \n", d);
	//printf("%3d%3d%3d \n", a, b, c);
	//printf("%08.2f", aa);

	int n[5];
	int i;
	for (i = 0; i < 5; i++) {
		scanf_s("%d", &n[i]);
	}
	for (i = 0; i < 5; i++) {
		printf("%d", n[i==4?0:i+1]);
	}

}
