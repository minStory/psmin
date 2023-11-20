#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

typedef struct
{
    char title[30];
    char author[30];
    int published;
}Book;

int main(void)
{
    Book books[3];
    int i;

    printf("=== 도서 정보 입력 ===\n");
    for(i = 0; i < 3; i++)
    {
        printf("제목 : ");
        scanf("%s", books[i].title);
        printf("저자 : ");
        scanf("%s", books[i].author);
        printf("출간년도 : ");
        scanf("%d", &books[i].published);
    }

    printf("=== 도서 정보 출력 ===\n");
    for(i = 0; i < 3; i++)
    {
        printf("<Book %d>\n", i + 1);
        printf("제목 : %s\n", books[i].title);
        printf("저자 : %s\n", books[i].author);
        printf("출간년도 : %d\n", books[i].published);
    }
    
    return 0;
}