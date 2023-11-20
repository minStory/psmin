#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void) 
{
    int *ptr; // 할당된 메모리의 주소 값을 저장할 포인터
    int count = 0; // 데이터 입력받은 개수
    int maxSize = 3; // 할당받은 메모리 크기
    int num; 
    int i;
    
    ptr = (int *)calloc(maxSize, sizeof(int));
    while(1)
    {
        printf("정수를 입력하세요(-1 입력시 종료) : ");
        scanf("%d", &num);
        if(num == -1)
        {
            break;
        }
        
        // 입력한 정수의 개수가 메모리 크기만큼 찼을 경우
        if(count == maxSize)
        {
            maxSize += maxSize;
            // 재할당을 통한 메모리 영역 확장
            ptr = (int *)realloc(ptr, maxSize * sizeof(int));
        }
        
        // 사용자 입력 정수로 힙영역 메모리 초기화 
        ptr[count++] = num;
    }
    
    for(i = 0; i < count; i++)
    {
        printf("%d   ", ptr[i]);
    }
    printf("\n");
    
    if(ptr != NULL)
    {
        free(ptr);	
    }
}