#include<stdio.h>
#include<stdlib.h>
#include<string.h>
void main() {
	char* s1 = "Take a Look!";
	char* s2 = (char*)calloc(20,sizeof(char));		//char�� ��� 20��ŭ ũ�� �Ҵ�

	strcpy_s(s2,strlen(s1)+1, s1);							//���ڿ�����->strcpy_s(�����ҹ迭,�����ҹ迭 ũ��,���ο�迭)
																		//�����ҹ迭ũ��� s1+1(NULL) or ó�� �Ҵ��ߴ� 20 ���� ����
		printf("%s\n", s2);

		 free(s2); 

}