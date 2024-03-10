#include<stdio.h>
int add(int num1, int num2) {
	return num1 + num2;
}
void ShowaddResult(int num) {
	printf("µ¡¼À°á°ú Ãâ·Â: %d", num);
}
int ReadNum(void) {
	int num;
	scanf_s("%d", &num);
	return num;
}
void HowToUseThisProg(void) {
		printf("µÎ °³ÀÇ Á¤¼ö¸¦ ÀÔ·ÂÇÏ½Ã¸é µ¡¼À°á°ú Ãâ·ÂµÊ\n");
		printf("±×·³ °á°ú :\n");
}
void main(void) {
		int result, num1, num2;
		HowToUseThisProg();
		num1 = ReadNum();
		num2 = ReadNum();
		result = add(num1, num2);
		ShowaddResult(result);

		return 0;
}



