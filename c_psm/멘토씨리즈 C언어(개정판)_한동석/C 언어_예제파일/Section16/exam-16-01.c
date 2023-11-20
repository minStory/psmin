#include <stdio.h>

// 배열을 전달받을 수 있는 int형 포인터 변수 arr
int readArray(int * arr, int length)
{
    int i;
    printf("배열의 요소 읽어보기 : [ ");
    for(i = 0; i < length; i++)
    {
        // arr[i] == (*arr+i)
        printf("%d", arr[i]);
        if(i+1 < length)
        {
            printf(", ");
        }
        else
        {
            printf(" ");
        }
    
    }
    printf("]\n");
}

int main(void)
{
    int arr[3] = {3, 6, 9};
    readArray(arr, 3); // 배열의 이름 arr를 포인터 변수에 대입! 
    
    return 0;
}