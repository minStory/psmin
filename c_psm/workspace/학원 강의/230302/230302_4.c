#include<stdio.h>
void main() {

	//int arr[3] = { 10, 20, 30 };
	//printf("%d\n", arr[2]);
	//arr[1] = 50;
	//printf("%d\n", arr[1]);

	int i;
	int odd[3];
	int even[5] = { 2,4,6,8,10 };

	odd[0] = 1;
	odd[1] = 3;
	odd[2] = 5;


	printf("%d %d %d\n", odd[0], odd[1], odd[2]);

	for (i = 0; i < 5; i++) {
		printf("%d ", even[i]);
	}
	printf("\n");


}