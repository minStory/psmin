#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#define STACK_SIZE 10  //스택 사이즈

int stack[STACK_SIZE];  //스택 사이즈
int top = -1;  //가장 위의 원소를 가리킬 top 변수

int isFull() {
	if (top >= STACK_SIZE - 1) {  // stack의 인덱스 0부터 시작
		printf("Error: STACK is full\n");
		return 1;
	}
	return 0;
}
int isEmpty() {
	if (top == -1) {
		printf("Error: STACK is empty!!\n");
		return 1;
	}
	return 0;
}
void push(int data) {
	if (!isFull()) {
		top++;
		stack[top] = data;
	}
}
int pop() {
	if (!isEmpty()) {
		return stack[top--];
	}
}
void printStack() {
	for (int i = 0; i <= top; i++) {
		printf("%d", stack[i]);
	}
	printf("\n");
}