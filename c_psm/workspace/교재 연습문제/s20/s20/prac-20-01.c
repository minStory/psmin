#include<stdio.h>
typedef struct
{
	char name[30];
	int age;
	double height;
}PERSON;

void main() {
	PERSON person = { "손오공",30,180.35 };
	PERSON* ptr = &person;							//포인터변수 ptr 선언하고 person의 주소값으로 초기화

	printf("이름 : %s\n나이 : %d\n신장 : %.2lf", ptr[0].name, ptr->age, person.height);	//배열형식, 포인터형식, 변수형식 출력 가능

}