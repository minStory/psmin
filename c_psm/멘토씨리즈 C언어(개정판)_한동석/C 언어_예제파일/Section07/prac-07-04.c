#include <stdio.h> 

int main(void)
{
    int kor = 88, eng = 90, mat = 58, soc = 81, sci = 72; 
    int total = kor + eng + mat + soc + sci;
    int average = total / 5;

    switch(average / 10)
    {
        case 10:
        case 9:
            printf("학점은 A 입니다!\n");
            break;
        case 8:
            printf("학점은 B 입니다!\n");
            break;
        case 7:
            printf("학점은 C 입니다!\n");
            break;
        case 6:
            printf("학점은 D 입니다!\n");
            break;
        default:
            printf("학점은 F 입니다!\n");
            break;
    }

    return 0; 
}