#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h> 

int main(void)
{
    int age;
    int price;

    printf("나이를 입력하세요 : ");
    scanf("%d", &age);

    // 나이에 따른 가격 결정
    price = age >= 20 ? 1250 : 800;
    printf("당신의 나이는 %d세이며, 요금은 %d원입니다!\n", age, price);

    return 0; 
}