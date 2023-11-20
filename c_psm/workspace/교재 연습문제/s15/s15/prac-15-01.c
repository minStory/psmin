#include<stdio.h>
void main() {
	int a = 0;
	add(5, 10);
	sub(7 ,3);
	multi(5, 5);
	div(10, 3);
	rest(6, 5);

}

int add(int x, int y) {
	printf("%d\n", x + y);
}
int sub(int x, int y) {
	printf("%d\n", x - y);
}
int multi(int x, int y) {
	printf("%d\n", x * y);
}
int div(int x, int y) {
	printf("%d\n", x / y);
}
int rest(int x, int y) {
	printf("%d\n", x % y);
}