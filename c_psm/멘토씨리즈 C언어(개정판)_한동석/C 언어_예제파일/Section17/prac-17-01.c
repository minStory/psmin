#include <stdio.h> 

int main(void)
{
    double value = 3.8; 
    double *ptr = &value; 
    double **dptr = &ptr;

    printf("%0.1f \n", **dptr); 
    printf("%u \n", &dptr); 
    printf("%u \n", *&ptr); 
    printf("%u \n", *dptr); 
    printf("%u \n", &*dptr); 
    printf("%u \n", &ptr);

    return 0; 
}