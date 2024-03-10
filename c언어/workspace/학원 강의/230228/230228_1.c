#include<stdio.h>
void main() {

	int num= 0;

	printf("%d", num);
	scanf_s("%d", &num);

	
	for (int i =num; i <5 ; i++) {
		

		if (i > 0) {
			for (int j = 0; j < num; j++) { printf("*"); }
		}
		else if (i > 1) {
			for (int k = 0; k < num -4; k++) { printf(" "); }
			for (int l = 0; l < num -2; l++) { printf("*"); }
		}
		else if (i > 2) {
			for (int m = 0; m < num -3; m++) { printf(" "); }
			for (int n = 0; n < num -4; n++) { printf("*"); }
		}
		else if (i > 3) {
			for (int o = 0; o < num -4; o++) { printf(" "); }
			for (int p = 0; p < num -2; p++) { printf("*"); }
		}
		else if (i > 4) {
			for (int q = 0; q < num; q++) { printf("*"); }
		}
		printf("\n");
	}
	return 0;
}