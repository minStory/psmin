#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h>

#define MAX_LEN 10
#define TRUE 1
#define FALSE 0

#define ADD 1
#define REMOVE 2
#define CHECK 3
#define ORDER 4
#define END 5

#define AMERICANO 1
#define CAFELATTE 2
#define JUICE 3
#define ICECREAM 4
#define CANCEL 5

#define AMERICANO_PRICE 4000
#define CAFELATTE_PRICE 4500
#define JUICE_PRICE 5000
#define ICECREAM_PRICE 5500

typedef struct
{
    char *foods[MAX_LEN];
    int idxOfFoods;
    int totalPrice;
} ItemList;

void select()
{
    puts("====== WHAT DO YOU WANT ======");
    puts("1. 음료 추가");
    puts("2. 음료 삭제");
    puts("3. 선택 음료 확인");
    puts("4. 선택 음료 주문");
    puts("5. 프로그램 종료");
}

void showMenu()
{
    puts("====== ADD MENU ======");
    puts("1. 아메리카노 (4000)");
    puts("2. 카페라떼 (4500)");
    puts("3. 주스 (5000)");
    puts("4. 아이스크림 (5500)");
    puts("5. 동작 취소");
}
void showRemoveMenu()
{
    puts("====== REMOVE MENU ======");
    puts("1. 아메리카노 (4000)");
    puts("2. 카페라떼 (4500)");
    puts("3. 주스 (5000)");
    puts("4. 아이스크림 (5500)");
    puts("5. 동작 취소");
}
void addMenu(ItemList *itemlist)
{

    if (itemlist->idxOfFoods >= MAX_LEN)
    {
        puts("더 이상 추가할 수 없습니다!");
        return;
    }

    int choice;
    showMenu();
    printf("선택 : ");
    scanf("%d", &choice);
    switch (choice)
    {
    case AMERICANO:
        puts("아메리카노 추가");
        itemlist->foods[(itemlist->idxOfFoods)++] = "아메리카노";
        itemlist->totalPrice += AMERICANO_PRICE;
        break;
    case CAFELATTE:
        puts("카페라떼 추가");
        itemlist->foods[(itemlist->idxOfFoods)++] = "카페라떼";
        itemlist->totalPrice += CAFELATTE_PRICE;
        break;
    case JUICE:
        puts("주스 추가");
        itemlist->foods[(itemlist->idxOfFoods)++] = "주스";
        itemlist->totalPrice += JUICE_PRICE;
        break;
    case ICECREAM:
        puts("아이스크림 추가");
        itemlist->foods[(itemlist->idxOfFoods)++] = "아이스크림";
        itemlist->totalPrice += ICECREAM_PRICE;
        break;
    case CANCEL:
        puts("동작 취소");
        break;
    default:
        puts("잘못된 입력입니다. 동작을 취소합니다.");
        break;
    }
}

int removeItem(ItemList *itemlist, char *itemToRemove)
{
    int i, rmIdx = -1;
    for (i = 0; i < itemlist->idxOfFoods; i++)
    {
        if (!strcmp(itemlist->foods[i], itemToRemove))
        {
            rmIdx = i;
            break;
        }
    }
    if (rmIdx >= 0)
    {
        for (i = rmIdx; i < itemlist->idxOfFoods; i++)
        {
            itemlist->foods[i] = itemlist->foods[i + 1];
        }
        if (rmIdx == 0 && itemlist->idxOfFoods == 1)
        {
            itemlist->foods[0] = NULL;
        }
        printf("%s 삭제했습니다\n", itemToRemove);
        return TRUE;
    }
    else
    {
        printf("삭제할 대상이 없습니다!\n");
        return FALSE;
    }
}

void removeMenu(ItemList *itemlist)
{

    if (itemlist->idxOfFoods <= 0)
    {
        puts("더 이상 삭제할 수 없습니다!");
        return;
    }

    int choice;
    showRemoveMenu();
    printf("선택 : ");
    scanf("%d", &choice);
    switch (choice)
    {
    case AMERICANO:
        if (removeItem(itemlist, "아메리카노"))
        {
            itemlist->totalPrice -= AMERICANO_PRICE;
            (itemlist->idxOfFoods)--;
        }
        break;
    case CAFELATTE:
        if (removeItem(itemlist, "카페라떼"))
        {
            itemlist->totalPrice -= CAFELATTE_PRICE;
            (itemlist->idxOfFoods)--;
        }
        break;
    case JUICE:
        if (removeItem(itemlist, "주스"))
        {
            itemlist->totalPrice -= JUICE_PRICE;
            (itemlist->idxOfFoods)--;
        }
        break;
    case ICECREAM:
        if (removeItem(itemlist, "아이스크림"))
        {
            itemlist->totalPrice -= ICECREAM_PRICE;
            (itemlist->idxOfFoods)--;
        }
        break;
    case CANCEL:
        puts("동작 취소");
        break;
    default:
        puts("잘못된 입력입니다. 동작을 취소합니다.");
        break;
    }
}

void checkMenu(ItemList *itemlist)
{
    int i = 0;
    printf("주문 품목 총액은 %d원입니다! 품목은 다음과 같습니다.\n ==> ", itemlist->totalPrice);
    for (i = 0; i < itemlist->idxOfFoods; i++)
    {
        printf("%s,", itemlist->foods[i]);
    }
    printf("\b ");
    printf(" \n");
}

int order(ItemList *itemlist)
{
    if (itemlist->idxOfFoods <= 0)
    {
        puts("아무것도 선택하지 않아 주문 불가합니다!");
        return -1;
    }

    int choice;
    checkMenu(itemlist);
    puts("정말로 주문하시겠어요?");
    printf("yes (1) , no (2) : ");
    scanf("%d", &choice);

    if (choice == 1)
        return TRUE;
    else
        return FALSE;
}
int main(void)
{
    ItemList itemlist;
    itemlist.idxOfFoods = 0;
    itemlist.totalPrice = 0;
    int choice;

    while (1)
    {
        select();
        printf("선택 : ");
        scanf("%d", &choice);
        printf("\n\n");
        switch (choice)
        {
        case ADD:
            addMenu(&itemlist);
            printf("\n\n");
            break;
        case REMOVE:
            removeMenu(&itemlist);
            printf("\n\n");
            break;
        case CHECK:
            checkMenu(&itemlist);
            printf("\n\n");
            break;
        case ORDER:
            if (order(&itemlist))
            {
                puts("주문 완료! 프로그램을 종료합니다.");
                return 0;
            }
            else
            {
                puts("주문 보류!");
                printf("\n\n");
            }
            break;
        case END:
            puts("프로그램을 종료합니다.");
            return 0;
        default:
            puts("잘못된 입력입니다. 동작을 취소합니다.");
            return 0;
        }
    }
    
    return 0;
}