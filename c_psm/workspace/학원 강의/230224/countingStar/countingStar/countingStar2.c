#include<stdio.h>
void main() {

	for (int i = 0; i < 5; i++) {

		if (i == 0) {
			for (int j = 0; j < 5; j++) {	printf("*");	}
		}

		else if (i == 1) {
			for (int k = 0; k < 1; k++) {printf(" ");}
			for (int l = 0; l < 3; l++) {printf("*");}
		}

		else if (i == 2) {
			for (int m = 0; m < 2; m++) {printf(" ");}
			for (int n = 0; n < 1; n++) {printf("*");}
		}

		else if (i == 3) {
			for (int o = 0; o < 1; o++) {printf(" ");}
			for (int p = 0; p < 3; p++) {printf("*");}
		}

		else if (i == 4) {
			for (int q = 0; q < 5; q++) {printf("*");}
		}

		printf("\n");

	}

}

	//for (int i = 0; i < 1; i++) {
	//	printf("*****\n");
	//	printf(" *** \n");
	//	printf("   *  \n");
	//	printf(" *** \n");
	//	printf("*****\n");
	//}
	//return 0;