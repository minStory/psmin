#include<stdio.h>
void main() {

	//1번
	//for (int i = 100; i <= 200; i++) {
	//	if (i % 3 == 0||i%7==0) {
	//		printf("%d ", i);
	//	}
	//}

	//2번
	//int a = 0, b = 0, temp=0;

	//scanf_s("%d %d", &a, &b);
	//if (a > b) {
	//	temp = a;
	//	a = b;
	//	b = temp;
	//}
	//for (; a <= b; a++) {
	//		for (int j = 0; j < 9; j++) {
	//			printf("%.2d * %.2d = %.2d ", a, j + 1, a * (j + 1));
	//		}
	//		printf("\n");
	//	}

	//3번
	//int n = 2;	//소수의 최소값인 2부터 시작
	//int count = 0;	//나타낼 값의 개수

	//while (count < 10) {	//반복 횟수를 알수 없기에 while문 사용, 조건은 나타낼 값 10개가 될 때 까지
	//	for (int i = 2; ; i++) {		//for문 사용하여 소수의 최소값부터 반복 시작
	//		if (i == n) {		// 반복을 하다가 두 값이 서로 같을 때 출력
	//			printf("%d ", n);
	//			count++;	//나타낼 값의 개수 증가
	//			break;		//for문 탈출
	//		}
	//		else if (n % i ==0) { break; }	// 두값 사이에 배수가 존재할 때 for문 탈출
	//	}
	//	n++; //for문 탈출하여 비교값 증가
	//}

	//for (int i = 1; i <= 30; i++) {
	//	int rest = 0;
	//	for (int j = 1; j <= i; j++) {
	//		if (i % j == 0) { rest++; }
	//	}
	//	if (rest == 2) { printf("%d ", i); }
	//}

	//4번

	//int a = 0, b = 0;
	//char oper=' ';

	//printf("피연산자 1 : ");
	//scanf_s("%d", &a);
	//printf("연산자 : ");
	//scanf_s(" %c", &oper); //문자 자동 엔터 방지를 위해 맨앞에 공백 한칸 주기
	//printf("피연산자 2 : ");
	//scanf_s("%d", &b);

	//if (oper == '+') {
	//	printf("%d %c %d = %d", a, oper, b, a + b);
	//}
	//else if (oper == '-') {
	//	printf("%d %c %d = %d", a, oper, b, a - b);
	//}
	//else if (oper == '*') {
	//	printf("%d %c %d = %d", a, oper, b, a * b);
	//}
	//else if (oper == '/') {
	//	printf("%d %c %d = %d", a, oper, b, a / b);
	//}
	//else if (oper == '%') {
	//	printf("%d %c %d = %d", a, oper, b, a % b);
	//}

	//switch (oper) {
	//case '+':
	//	printf("%d %c %d = %d", a,oper, b, a + b);
	//	break;
	//case '-':
	//	printf("%d %c %d = %d", a,oper, b, a - b);
	//	break;
	//case '*':
	//	printf("%d %c %d = %d", a,oper, b, a * b);
	//	break;
	//case '/':
	//	printf("%d %c %d = %d", a,oper, b, a / b);
	//	break;
	// case '%':
	// printf("%d %c %d = %d", a, oper, b, a % b);
	// break;
	//default:
	//	break;
	//}

	//5번
	int a = 1, b = 1, next = 0;
	int cnt = 0;	//반복 횟수 선언

	scanf_s("%d", &cnt);

	for (int i = 0; i < cnt; i++) {
		printf("%d ", a);		//먼저 초기값 출력
		next = a + b;		//3번째 값에 1번째값+2번째값 담기
		a = b;			// 1번째값에 2번째값 담기
		b = next;		// 2번째값에 3번째값 담기
		}
}

