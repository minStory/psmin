#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h> 

int main(void)
{
    int userNumber; // 사용자 입력 정수  
    printf("정수를 입력하세요 : ");
    scanf("%d", &userNumber);

    int total = 0; // 총합 
    int cntNumber = 1; // 정수 조회하기  
    while(cntNumber <= userNumber)
    {
      total += cntNumber++;
    }

    printf("1부터 %d까지의 합은 %d입니다.\n", userNumber, total);

    return 0; 
}