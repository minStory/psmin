#include<stdio.h>
void main() {
	int T, k, n = 0;
	int arr[20][20] = { 0, };		//14층까지지만 넉넉하게 선언

	for (int i = 0; i < 15; i++) {
		arr[0][i] = i+1;			//0층의 i호는 i명	(기준)
		arr[i][0] = 1;				//k층의 0호에는 1명	(기준)
	}
	for (int i=1;i<=15;i++){
		for (int j=1;j<=15;j++){
			arr[i][j] = arr[i - 1][j] + arr[i][j - 1];		//i층 j호의 인원수 i-1층+j-1호의 인원수
		}
	}
	scanf_s("%d", &T);

	for (int i = 0; i < T; i++) {
		scanf_s("%d %d", &k, &n);
		printf("%d\n", arr[k][n - 1]);
	}
}