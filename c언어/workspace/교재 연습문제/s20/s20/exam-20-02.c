#include<stdio.h>

typedef struct
{
	int x; int y;
}Point;

typedef struct
{
	Point* start;
	Point* end;
}Line;

void main() {
	Point p1 = { 10,8 };
	Point p2 = { 20,40 };
	
	Line line = { &p1,&p2 };

	printf("���� ������ : [%d, %d]\n", line.start->x, line.start->y);
	printf("���� ���� : [%d, %d]\n", line.end->x, line.end->y);

}