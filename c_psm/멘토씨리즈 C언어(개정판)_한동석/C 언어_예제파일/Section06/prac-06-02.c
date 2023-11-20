#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h> 

int main(void)
{
    int age, height; // 나이와 키 
    int canRide; // 탈 수 있는지 여부

    printf("나이를 입력하세요 : ");
    scanf("%d", &age);
    printf("키를 입력하세요 : ");
    scanf("%d", &height);

    // 나이가 12세 이상 그리고 키가 120cm 이상 
    canRide = age >= 12 && height >= 120;

    // 삼항 연산식 결과값 출력
    printf(canRide ? "놀이기구에 탑승할 수 있습니다!" : "놀이기구에 탑승할 수 없습니다!");
    printf("\n");

    return 0; 
}