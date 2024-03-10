//5  -- > 입력
//
//출력
//    *
//   ***
//  *****
// *******
//*********
// *******
//  *****
//   ***
//    *

#include<stdio.h>
void main() {
	int count = 0;
	scanf_s("%d", &count);

	
	for (int i = 0; i < 1; i++) {
		for (int j = count; j > count - 4; j--) { printf(" "); }
		for (int k = 0; k < count * 2 - 9; k++) { printf("*"); }
		printf("\n");

		for (int j = count; j > count - 3; j--) { printf(" "); }
		for (int k = 0; k < count * 2 - 7; k++) { printf("*"); }
		printf("\n");

		for (int j = count; j > count - 2; j--) { printf(" "); }
		for (int k = 0; k < count * 2 - 5; k++) { printf("*"); }
		printf("\n");

		for (int j = count; j > count-1; j--) {printf(" ");}
		for (int k = 0; k < count * 2 - 3; k++) { printf("*"); }
		printf("\n");

		for (int ref = 0; ref < count * 2 - 1; ref++) { printf("*"); }
		printf("\n");

		for (int j = count; j > count - 1; j--) { printf(" "); }
		for (int k = 0; k < count * 2 - 3; k++) { printf("*"); }
		printf("\n");

		for (int j = count; j > count - 2; j--) { printf(" "); }
		for (int k = 0; k < count * 2 - 5; k++) { printf("*"); }
		printf("\n");

		for (int j = count; j > count - 3; j--) { printf(" "); }
		for (int k = 0; k < count * 2 - 7; k++) { printf("*"); }
		printf("\n");

		for (int j = count; j > count - 4; j--) { printf(" "); }
		for (int k = 0; k < count * 2 - 9; k++) { printf("*"); }
		printf("\n");

	}
}
