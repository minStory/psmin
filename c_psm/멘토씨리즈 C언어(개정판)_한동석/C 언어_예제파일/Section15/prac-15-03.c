#include <stdio.h>

int HowManySeven(int number)
{
    int i; 
    int howmany = 0;
    for(i = number + 1; i < number + 200; i++)
    {
        if(i % 7 == 0) 
            howmany++;
    }

    return howmany;
}

int main(void)
{
    // 결과 확인을 위해 임의의 숫자를 전달하였습니다.
    int result = HowManySeven(100);
    printf("100과 300 사이의 7의 배수는 %d개!\n", result);

    result = HowManySeven(55);
    printf("55와 255 사이의 7의 배수는 %d개!\n", result);

    return 0;
}