#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct 
{
  	char name[50];
	  int number;
}Student;

void Insert(Student* list, int * numOfStudent);
void PrintAll(Student* list, int * numOfStudent);
void Search(Student* list, int * numOfStudent);
void Delete(Student* list, int * numOfStudent);

int main(void)
{
    int sel;
    int done = 0;
    int numOfStudent = 0; 
    Student *slist;
    slist=(Student*)malloc(sizeof(Student) * 100);

    while(1)
    {
        puts("=== 메뉴 ===");
        puts("1. 입력");
        puts("2. 출력");
        puts("3. 검색");
        puts("4. 삭제");

        printf("당신의 선택은 : ");
        scanf("%d", &sel);
        
        switch(sel) 
        {
            case 1:
                Insert(slist, &numOfStudent);
                break;
            case 2:
                PrintAll(slist, &numOfStudent);
                break;
            case 3:
                Search(slist, &numOfStudent);
                break;
            case 4:
                Delete(slist, &numOfStudent);
                break;
            default:
                puts("잘못 선택하셨습니다.");
                done = 1;
                break;
        }
        if(done) break;
    }

	  return 0;
}
void Insert(Student* list, int * numOfStudent)
{
    int stuNum;
    char stuName[50];
    printf("학생번호 : ");
    scanf("%d", &stuNum);
    printf("학생이름 : ");
    scanf("%s", stuName);
    list[*numOfStudent].number = stuNum;
    strcpy(list[*numOfStudent].name, stuName);
    *numOfStudent += 1;
}
void PrintAll(Student* list, int * numOfStudent)
{
   int i;
   for(i = 0; i < *numOfStudent; i++)
   {
       printf("학생 번호 : %d 학생 이름 : %s\n", list[i].number, list[i].name);
   }
}
void Search(Student* list, int * numOfStudent)
{
    int searchNum, i, found = 0;
    printf("학생번호 검색 : ");
    scanf("%d", &searchNum);
    for(i = 0; i < *numOfStudent; i++)
    {
        if(searchNum == list[i].number)
        {
            printf("검색된 학생 이름 : %s\n", list[i].name);
            found = 1;
        }
    }
    if(!found) printf("해당되는 학생이 없습니다.\n");
}

void Delete(Student* list, int * numOfStudent)
{
    int delNum, i, deleted = 0;
    printf("학생번호 삭제 : ");
    scanf("%d", &delNum);
    for(i = 0; i < *numOfStudent; i++)
    {
        if(delNum == list[i].number)
        {
            printf("삭제 학생 이름 : %s\n", list[i].name);
            if(*numOfStudent > i - 1)
            {
                int j;
                for(j = i; j < *numOfStudent; j++)
                {
                    list[j] = list[j + 1];
                }
            }

            *numOfStudent -= 1;
            deleted = 1;
        }
    }    
    if(!deleted) printf("해당되는 학생이 없습니다.\n");
}