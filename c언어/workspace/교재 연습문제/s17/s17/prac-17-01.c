#include<stdio.h>


void main() {
	double value = 3.8;
	double* ptr = &value;
	double** dptr = &ptr;

	printf("%0.1f\n", **dptr);	//3.8
	printf("%u \n", &dptr);		//�ּҰ�
	printf("%u \n", *&ptr);		//�ּҰ�
	printf("%u \n", *dptr);		//(���͵���)
	printf("%u \n", &*dptr);		//�ּҰ�
	printf("%u \n", &ptr);			//(���͵���)
}