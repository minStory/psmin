#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>

int * createArr(int *arr, int num, int length)
{
    int i = 0, j = 0;
    int * ptr = (int *)malloc(sizeof(int) * (length + 1));
    while(i < length + 1)
    {
      if(arr[j] < num)
      {
          ptr[i++] = arr[j++];
      }
      else
      {
          if(ptr[i-1] == num || ptr[i-1] > num)
          {
              ptr[i++] = arr[j++];
          }
          else
          {
              ptr[i++] = num;
          }
      }
    }
    return ptr;
}

int main(void)
{
    int arr[3] = {1, 5, 7}; 
    int length = 3;
    int num = 3; // 추가하고자 하는 정수
    int * ptr;
    int i;
    ptr = createArr(arr, num, length);

    for(i = 0; i < length + 1; i++)
    {
        printf("%d ", ptr[i]);
    }

    return 0;
}