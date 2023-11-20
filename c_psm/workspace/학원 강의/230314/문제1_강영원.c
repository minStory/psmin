#include <stdio.h>
int main(void) {

	int tc, T;
	scanf_s("%d", &T);

	for (tc = 1; tc <= T; tc++) {
		int date;
		scanf_s("%d", &date);
		int y, m, d;
		y = date / 10000;
		m = date % 10000 / 100;
		d = date % 100;

		printf("#%d ", tc);

		switch (m)
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			if (d >= 1 && d <= 31) {
				printf("%04d/%02d/%02d", y, m, d);
			}
			else {
				printf("-1\n");
			}
			break;
		case 2:
			if (d >= 1 && d <= 28) {
				printf("%04d/%02d/%02d", y, m, d);

			}
			else {
				printf("-1\n");
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			if (d >= 1 && d <= 30) {
				printf("%04d/%02d/%02d", y, m, d);
			}
			else {
				printf("-1\n");
			}
			break;

		default:
			printf("-1\n");


		}
		printf("\n");

	}
	return 0;



}
