#include <stdio.h>
#include <stdlib.h> // 동적 할당 함수를 사용하기 위한 헤더파일 선언

int main(void) 
{
    int * iptr = (int *)malloc(sizeof(int) * 5); // int형 5개만큼
    double * dptr = (double *)malloc(sizeof(double) * 3); // double형 3개만큼
    int i;

    // 할당된 메모리 공간에 int형 크기만큼씩 순차적 접근하기
    for(i = 0; i < 5; i++)
    {
        iptr[i] = 10 * (i+1);
    }
    for(i = 0; i < 5; i++)
    {
        printf("%d ", iptr[i]);
    }
    printf("\n");

    dptr[0] = 3.14; dptr[1] = 4.31; dptr[2] = 1.43;
    printf("%g %g %g\n", dptr[0],dptr[1],dptr[2]);

    // 힙 영역에 할당했던 메모리 해제 
    if(iptr != NULL) free(iptr);
    if(dptr != NULL) free(dptr);
    
    return 0;
}