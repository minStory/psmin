#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#define LEN 5

void asc(int arr[]);
void desc(int arr[]);

int main() {
    int arr[LEN];
    int select;
    int i, tmp = 0;

    
    for (i = 0; i < LEN; i++)
    {
        printf("배열 요소 %d 입력 : ", i + 1);
        scanf("%d", &arr[i]); 
    }

    // asc(arr);
    desc(arr);   
}

void asc(int arr[]) 
{      
    int i, j, tmp = 0;
    for (i = 0; i < LEN; i++) 
    {
        for (j = i; j < LEN; j++) 
        {
            if (arr[i] > arr[j]) 
            {
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
    }
    printf("== 오름차순 정렬 함수 호출! ==\n");
    for (i = 0; i < LEN; i++)
        printf("%d ", arr[i]);
    printf("\n");
}

void desc(int arr[]) 
{      
    int i, j, tmp = 0;
    for (i = 0; i < LEN; i++) 
    {
        for (j = i; j < LEN; j++)
        {
            if (arr[i] < arr[j]) 
            {
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
    }
    printf("== 내림차순 정렬 함수 호출! ==\n");
    for (i = 0; i < LEN; i++)
        printf("%d ", arr[i]);
    printf("\n");
}
