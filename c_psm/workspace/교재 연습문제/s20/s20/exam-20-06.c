#include<stdio.h>

typedef struct
{
	int xpos;
	int ypos;
}Point;

void setPosSameValue(Point* ptr)
{
	if (ptr->xpos > ptr->ypos)
	{
		ptr->ypos = ptr->xpos;
	}
	else
	{
		ptr->xpos = ptr->ypos;
	}
}
void printfPoint(Point point)
{
	printf("x : %d, y : %d\n", point.xpos, point.ypos);
}

void main() {
	Point position1 = { 33,66 };
	Point position2 = { 6,3 };

	setPosSameValue(&position1);
	setPosSameValue(&position2);

	printfPoint(position1);
	printfPoint(position2);

	printf("%d %d %d %d", position1.xpos, position1.ypos, position2.xpos, position2.ypos); //값 계속적 변경 (Call-by-ref)
}