#include<stdio.h>

void main() {

	int arr[3] = { 1,2,3 };
	printf("�迭 �� ����� �ּ� Ȯ��\n");
	printf("�迭�� �̸� : %p\n",arr);
	printf("ù��° ��� : %p\n",&arr[0]);
	printf("�ι�° ��� : %p\n",&arr[1]);
	printf("����° ��� : %p\n",&arr[2]);
	
	short sarr[3] = { 1,2,3 };
	int iarr[3] = { 10,20,30 };

	//�ε�����ȣ�� ����
	printf("%d %d %d\n", sarr[0], sarr[1], sarr[2]);
	printf("%d %d %d\n", iarr[0], iarr[1], iarr[2]);
	//�����Ϳ������� ����
	printf("%d %d %d\n", *sarr, *(sarr+1), *(sarr+2));
	printf("%d %d %d\n", *iarr, *(iarr+1), *(iarr+2));
	//�ּ� Ȯ��
	printf("%p %p %p\n", &sarr[0], &sarr[1], &sarr[2]);
	printf("%p %p %p\n", &iarr[0], &iarr[1], &iarr[2]);

	//Ȯ���غ���
	
	int v = 10;
	int* ptr = &v;

	v = *ptr++;
	v = (*ptr)++;
	v = *++ptr;
	v = ++ * ptr;


}