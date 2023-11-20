#include <stdio.h>

typedef struct
{
    int xpos;
    int ypos; 
}Point;

// 함수의 원형(prototype)
void SwapPoint(Point * ptr1, Point * ptr2);

int main(void)
{
    Point position1 = {3, 6}; 
    Point position2 = {4, 9};

    SwapPoint(&position1, &position2);

    printf("position1 : [ %d, %d ]\n", position1.xpos, position1.ypos);
    printf("position2 : [ %d, %d ]\n", position2.xpos, position2.ypos);
    
    return 0;
}

void SwapPoint(Point * ptr1, Point * ptr2)
{
    Point temp = *ptr1;
    *ptr1 = *ptr2;
    *ptr2 = temp;
}