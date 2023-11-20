#include<stdio.h>
typedef struct
{
	int xpos;
	int ypos;
}Point;

typedef struct
{
	Point LeftTop;
	Point RightBottom;
}Rect;

void printRectArea();

void main() {

	Rect rect = {
		{0,0},
		{10,10}
	};
	printRectArea(rect);
	
}
void printRectArea(Rect rect)
{
	int width = rect.RightBottom.xpos - rect.LeftTop.xpos;
	int height = rect.RightBottom.ypos - rect.LeftTop.ypos;

	printf("사각형의 넓이는 : %d\n", width * height);
}