#include <stdio.h>

int main(void) 
{
    int i, n = 2;
    int count = 0;

    while(count != 10)
    { 
        for(i = 2; ;i++)
        {
              if(i == n)
              { 
                  printf("%d ",n);
                  count++;
                  break;
              }
              else if(n % i == 0) break;
        }
        n++; 
    }
    printf("\n");

    return 0;
}