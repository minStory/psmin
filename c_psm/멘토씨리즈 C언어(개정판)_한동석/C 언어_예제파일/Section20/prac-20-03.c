#include <stdio.h>

typedef struct
{
    int xpos;
    int ypos; 
}Point;

typedef struct
{
    Point leftTop;
    Point rightBottom;
}Rect;

void printRectArea(Rect rect);

int main(void)
{
    Rect rect = {
      {0, 0},
      {10, 10}
    };

    printRectArea(rect);

    return 0;
}

void printRectArea(Rect rect)
{
    int width = rect.rightBottom.xpos - rect.leftTop.xpos;
    int height = rect.rightBottom.ypos - rect.leftTop.ypos;

    printf("사각형의 넓이는 %d\n", width * height);
}