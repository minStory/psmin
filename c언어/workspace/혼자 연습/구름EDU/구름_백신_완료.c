#include<stdio.h>
void main() {
	int n = 0, m = 0;	//ȯ�� ��, ���� �� ����
	int* a = 0;			//a�� ����
	int* b = 0;			//b�� ����

	scanf_s("%d %d", &n, &m);

	a = (int*)calloc(m, sizeof(int));	//a,b�� m��ŭ �����Ҵ�
	b = (int*)calloc(m, sizeof(int));

	for (int i = 0; i < m; i++) {			//a,b�� ȯ�� �Է�
		scanf_s("%d %d", a+i, b + i);
	}

	//a�� b�迭 ���� �� Ȯ��
	//printf("\n");	
	//for (int i = 0; i < m; i++) {
	//	printf("%-2d ", a[i]);
	//}
	//printf("\n");
	//for (int i = 0; i < m; i++) {
	//	printf("%-2d ", b[i]);
	//}

	int cycle = 0;		//�ݺ� Ƚ�� ����
	int maxCnt = 0;		//�ִ� ġ�� ������ ȯ�� �� ����
	int maxPerson = 0;		//�ִ� ġ�� ������ ȯ�� ��ȣ ����
	while (cycle != m) {		//m��ŭ �ݺ�
	int cnt = 0;				//�ݺ��Ҷ����� 0���� �ʱ�ȭ
	for (int i = 0; i < m; i++) {
		a[cycle] == a[i] || a[cycle] == b[i] ? cnt++ : cnt;	//���� ���� a,b��ȯ�ڰ� �ٸ� �࿡ �ִٸ� cnt++
		b[cycle] == a[i] || b[cycle] == b[i] ? cnt++ : cnt;
		if (maxCnt < cnt) {		//cnt�� �ִ�cnt���� Ŭ ��
			maxCnt = cnt;		//�ִ�cnt�� cnt�� ����
			maxPerson = a[i] <= b[i] ? a[i] : b[i];		//���� ��ȣ ȯ�ڸ� ����
		}
	}
		cycle++;
	}
	printf("%d %d", maxPerson, maxCnt);

}