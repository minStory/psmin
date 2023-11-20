#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#define STACK_SIZE 10  //���� ������

int stack[STACK_SIZE];  //���� ������
int top = -1;  //���� ���� ���Ҹ� ����ų top ����

int isFull() {
	if (top >= STACK_SIZE - 1) {  // stack�� �ε��� 0���� ����
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