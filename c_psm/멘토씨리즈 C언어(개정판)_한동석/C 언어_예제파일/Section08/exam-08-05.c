#include <stdio.h>

int main(void) 
{
    int number = 0;
    int sum = 0; // 입력한 모든 정수의 합
  
    do{
        number++;
        sum += number;
    }while(number < 10);
    
    printf("1~10 까지의 합 : %d", sum);

    return 0;
}