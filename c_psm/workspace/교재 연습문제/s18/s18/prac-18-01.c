#include<stdio.h>
#include<stdlib.h>
#include<string.h>
void main() {
	char* s1 = "Take a Look!";
	char* s2 = (char*)calloc(20,sizeof(char));		//char의 경우 20만큼 크기 할당

	strcpy_s(s2,strlen(s1)+1, s1);							//문자열복사->strcpy_s(변경할배열,변경할배열 크기,새로운배열)
																		//변경할배열크기는 s1+1(NULL) or 처음 할당했던 20 으로 설정
		printf("%s\n", s2);

		 free(s2); 

}