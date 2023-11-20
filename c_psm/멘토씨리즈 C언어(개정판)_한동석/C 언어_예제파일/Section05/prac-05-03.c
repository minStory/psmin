#include <stdio.h> 

int main(void)
{
    // 과목별 성적 저장하기 
    int kor = 86, eng = 75, mat = 88, soc = 60, sci = 96;

    // 총점 
    int total = kor + eng + mat + soc + sci;

    // 평균(실수)
    double average = (double)total / 5; 
    printf("짱구의 평균 점수 : %0.2f\n", average);

    return 0; 
}