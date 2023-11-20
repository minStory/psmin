#include<stdio.h>
#include<stdlib.h>
#include<string.h>
void main() {

	//1번
	//int arr[5] = { 0 };
	//int max = 0, min = 0, total = 0;
	//for (int i = 0; i < 5; i++) {
	//	printf("NUM%d : ", i + 1);
	//	scanf_s("%d", &arr[i]);
	//}
	//min = arr[0];
	//for (int i = 0; i < 5; i++) {
	//	if (max < arr[i]) { max = arr[i]; }
	//	if (min > arr[i]) { min = arr[i]; }
	//	total += arr[i];
	//}
	//printf("최대값 : %d\n최소값 : %d\n총합계 : %d", max, min, total);

	//2번
	//int arr[8] = { 0 };
	//
	//for (int i = 0; i < 8; i++) {
	//	printf("NUM%d : ", i + 1);
	//	scanf_s("%d", &arr[i]);
	//}
	//printf("홀수 : ");
	//for (int i = 0; i < 8; i++) {
	//	if (arr[i] % 2) { printf("%d ", arr[i]); }
	//}
	//printf("\n짝수 : ");
	//for (int i = 0; i < 8; i++) {
	//	if (!(arr[i] % 2)) { printf("%d ", arr[i]); }
	//}

	//3번

	//int* num = 0;	//포인터변수 선언
	//int n = 0;			//입력받을 정수 선언
	//scanf_s("%d", &n);

	//int temp = 0;		//임시로 입력받은 정수를 담을 변수 선언
	//int len = 0;		//입력받은 정수의 길이를 담을 변수 선언
	//temp = n;			//임시변수에 정수를 대입
	//while (temp > 1) {	//정수를 1보다 작아질 때까지 /10 반복하여 정수 길이 추출
	//	temp /= 10;
	//	len++;
	//}
	//num = (int*)calloc(len, sizeof(int));		//입력받은 정수의 길이만큼 동적할당 선언

	//int multi = 1;		//10을 반복.누적하여 곱할 변수 선언 (곱하기이기 때문에 0으로 선언 불가)
	//for (int i = 0; i < len; i++) {	//정수의 길이만큼 반복
	//	temp = n;		//반복이 시작할 때마다 임시변수 값을 입력받은 정수값으로 초기화
	//	num[i] = temp/multi%10;	//배열의 첫번째 Index에 입력받은 정수의 1의자리부터 역순으로 대입
	//	multi *= 10;	// 반복이 끝날때마다 *10을 누적시켜 구할 자리수 변환
	//}

	//for (int i = 0; i < len; i++) {	//자리수의 길이만큼 역순으로 출력
	//	for (int j = len-1 - i; j >= 0; j--) {	//이중 반복하여 한칸씩 줄여가며 출력
	//		printf("%d ", num[j]);
	//	}
	//	printf("\n");
	//}

	//4번
	//char word[30] = "";	//문자열 선언
	//char temp[30] = "";	//비교할 문자열 선언

	//printf("문자열 입력 : ");
	//scanf_s("%s", word, sizeof(word));	//문자열 입력

	//int len = strlen(word);	//입력받은 문자열 길이 추출
	//for (int i = 0; i < len; i++) {	//문자열의 역순으로 비교할 문자열에 대입
	//	temp[len-1-i] = word[i];
	//}
	//printf(!strcmp(word,temp) ? "동일합니다." : "동일하지 않습니다.");	//문자열 비교함수로 비교

	//int cnt = 0;	//strcmp 미사용 시 cnt와 len의 차이로 비교
	//for (int i = 0; i < len; i++) {
	//	if (word[i] == temp[i]) { cnt++; }
	//}
	
	//int isSame = 0;		//한동석 강사 풀이
	//for (int i = 0; i < len; i++) {
	//	if (word[i] == word[len - 1 - i]) {
	//		isSame = 1;
	//	}
	//	else { 
	//		isSame = 0;
	//		break;
	//	}
	//}
	//printf(issame ? "동일합니다" : "동일하지 않습니다");
	// 
	// 
	//5번 나중에 풀어볼 것
	int year = 0, month = 0;
	int sum = 0;
	int check = 0;
	int days[12] = { 31,28,31,30,31,30,31,31,30,31,30,31 };

	printf("출력할 연도 : ");
	scanf_s("%d", &year);
	printf("출력할 달 : ");
	scanf_s("%d", &month);



}
