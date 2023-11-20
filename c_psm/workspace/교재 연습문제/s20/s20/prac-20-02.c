#include<stdio.h>
//typedef struct					//Call-By-Value 방식
//{
//	int xpos;
//	int ypos;
//}Point;
//Point printChangeData(Point ptr1,Point ptr2)
//{
//	int temp = 0;
//	temp = ptr1;
//	ptr1 = ptr2;
//	ptr2 = temp;
//
//	printf("pos1 x : %d, pos1 y : %d\n", ptr1.xpos, ptr1.ypos);
//	printf("pos2 x : %d, pos2 y : %d\n", ptr2.xpos, ptr2.ypos);
//}
//void main() {
//	Point position1 = { 3,6 };
//	Point position2 = { 4,9 };
//
//	printChangeData(position1,position2);
//
//	printf("%d %d\n", position1.xpos,position1.ypos);
//	printf("%d %d\n", position2.xpos,position2.ypos);
//}

typedef struct
{
	int xpos;
	int ypos;

}Point;
Point printChangeData(Point* ptr1, Point* ptr2)
{
	Point* temp=0;
	temp = (Point*)calloc(2, sizeof(Point));
	for (int i = 0; i < 2; i++) {
		Point temp = *(ptr1+i);
		*(ptr1+i) = *(ptr2+i);
		*(ptr2+i) = temp;
	}
	
	//temp = ptr1->xpos;
	//ptr1->xpos = ptr2->xpos;
	//ptr2->xpos = temp;

	//temp = ptr1->ypos;
	//ptr1->ypos = ptr2->ypos;
	//ptr2->ypos = temp;

	printf("pos1 x : %d, pos1 y : %d\n", ptr1->xpos, ptr1->ypos);
	printf("pos2 x : %d, pos2 y : %d\n", ptr2->xpos, ptr2->ypos);

}
void main() {

	Point position1 = { 3,6 };
	Point position2 = { 4,9 };

	printChangeData(&position1, &position2);

	printf("기존 pos1 x : %d, 기존 pos1 y : %d\n", position1.xpos,position1.ypos);
	printf("기존 pos2 x : %d, 기존 pos2 y : %d\n", position2.xpos,position2.ypos);

}