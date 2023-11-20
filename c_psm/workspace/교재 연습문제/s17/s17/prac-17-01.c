#include<stdio.h>


void main() {
	double value = 3.8;
	double* ptr = &value;
	double** dptr = &ptr;

	printf("%0.1f\n", **dptr);	//3.8
	printf("%u \n", &dptr);		//林家蔼
	printf("%u \n", *&ptr);		//林家蔼
	printf("%u \n", *dptr);		//(困客悼老)
	printf("%u \n", &*dptr);		//林家蔼
	printf("%u \n", &ptr);			//(困客悼老)
}