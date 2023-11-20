#include <stdio.h>

typedef struct
{
    char title[100];
    int published;
}Book;

typedef struct
{
    Book books[3]; // 멤버로 길이 정보 3인 구조체 배열 선언
}Bag;

int main(void) 
{
    // 선언과 동시에 초기화
    Bag myBag = {
        {
            {"지금 하지 않으면 언제 하겠는가", 2018},
            {"타이탄의 도구들", 2017},
            {"12가지 인생의 법칙", 2018}
        }
    };
    
    int i;

    // 배열 요소에 대한 순차적 접근
    for(i = 0; i < 3; i++)
    {
        printf("책 제목 : %s \n출간년도 : %d년\n", 
        myBag.books[i].title, myBag.books[i].published); // 개별 요소는 모두 구조체 변수
    }
    
    return 0;
}