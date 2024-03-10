#include<stdio.h>

int add(int a, int b) {
	return a + b;
}
int minus(int a, int b) {
	return a - b;
}
int multi(int a, int b) {
	return a * b;
}
int div(int a, int b) {
	return a / b;
}
void main() {

	int choice = 0;
	int x = 0, y = 0;

	printf("원하는 메뉴를 선택하세요.\n1. 덧셈\n2. 뺄셈\n3. 곱셈\n4. 나눗셈\n");
	scanf_s("%d", &choice);
	printf("두개의 수를 입력하세요.\n");
	scanf_s("%d %d", &x, &y);

	switch (choice) {
	case 1:
		printf("%d", add(x, y));
		break;
	case 2:
		printf("%d", minus(x, y));
		break;
	case 3:
		printf("%d", multi(x, y));
		break;
	case 4:
		printf("%d", div(x, y));
		break;
	default:
		printf("잘못 입력하셨습니다.");
		break;
	}
}

//	printf("%d",div(3, 5));
//
//
//
//
//
//	int x = 1, total = 1;
//
//	printf("숫자 입력 : ");
//	scanf_s("%d", &x);
//
//	for (int i = 1; i <= x; i++) {
//		total *= i;
//	}
//	printf("%d! = %d",x, total);
//}
//
//
//
//
//
//
//
//
//
//
