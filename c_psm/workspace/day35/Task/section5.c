#include<stdio.h>
void main() {

	//1��
	int num = 10;
	num++;
	printf("%d\n", num);
	printf("%d\n", num+3);
	printf("%d\n", ++num);
	printf("%d\n", num++);
	printf("%d\n", num);

	//2��
	int num1 = 27;

	printf("%d\n", num1 > 10);
	printf("%d\n", num1 == 27);
	printf("%d\n", num1 < 30);

	//3��
	int kor = 86, eng = 75, math = 88, soc = 60, sci = 96;
	int total = kor+eng+math+soc+sci;

		printf("%.2f\n", (float)total / 5);

	//4��
	int num2 = 5;

	printf("num�� �� : %d\n",++num2);
	printf("num�� �� : %d\n",num2++);
	printf("num�� �� : %d\n",++num2);
}