#include <stdio.h>



int main() {

	int villa[4][2];

	for (int i = 0; i < 4; i++) {
		for (int j = 0; j < 2; j++) {
			printf("%d0%dȣ �Է� : ", i+1, j+1);
			scanf_s("%d", &villa[i][j]);
		}
	}


	for (int i = 0; i <4 ; i++) {
		for (int j = 0; j < 2; j++) {
			printf("%d0%dȣ : %d�� ", i +1, j+1, villa[i][j]);
		}
		printf("\n");
	}

	
	return 0;

}