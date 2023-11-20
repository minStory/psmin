#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void) 
{
    int numOfPeachs;
    int fullBuckets; // 10개가 다 들어간 바구니
    int buckets; // 최종 바구니 개수

    printf("복숭아의 개수는 : ");
    scanf("%d", &numOfPeachs);

    fullBuckets = numOfPeachs / 10;
    buckets = fullBuckets + (numOfPeachs % 10 ? 1 : 0);

    printf("필요한 바구니의 수 : %d\n", buckets);

    return 0;
}