//스페이스로 띄어쓰기 된 단어들의 리스트가 주어질때, 단어들을 반대 순서로 뒤집어라.각 라인은 w개의 영단어로 이루어져 있으며, 총 L개의 알파벳을 가진다.
//각 행은 알파벳과 스페이스로만 이루어져 있다.단어 사이에는 하나의 스페이스만 들어간다.
//
//입력
//첫 행은 N이며, 전체 케이스의 개수이다.
//
//N개의 케이스들이 이어지는데, 각 케이스는 스페이스로 띄어진 단어들이다.스페이스는 라인의 처음과 끝에는 나타나지 않는다.N과 L은 다음 범위를 가진다.
//
//N = 5
//1 ≤ L ≤ 25
//출력
//각 케이스에 대해서, 케이스 번호가 x일때  "Case #x: " 를 출력한 후 그 후에 이어서 단어들을 반대 순서로 출력한다.
//
//3
//this is a test
//foobar
//all your base
//
//출력
//Case #1: test a is this
//Case #2: foobar
//Case #3: base your all
#include<stdio.h>
#include<string.h>
#include<stdlib.h>
void main() {
	int T = 0;
	char* s = (char*)calloc(100, sizeof(char));

	scanf_s("%d", &T);

	for (int i = 0 ; i < T; i++) {
		scanf_s("%s", s+strlen(s), 30);
	}

	for (int i = 0; i < T; i++) {
		printf("%d %s\n", i + 1, s);
	}


}
