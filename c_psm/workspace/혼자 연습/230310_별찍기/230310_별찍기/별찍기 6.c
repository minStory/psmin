#include<stdio.h>
void main() {
	int x = 0;


		for (int j = 0; j < x; j++)
		{
			for (int a = 0; a < x - j; a++)
			{
				cout << " ";
			}
			for (int s = 0; s < j * 2 + 1; s++)
			{
				cout << "*";
			}
			cout << endl;
		}
		for (int j = 0; j < x - 1; j++)
		{
			for (int a = 0; a < j + 2; a++)
			{
				cout << " ";
			}
			for (int s = 0; s < (x * 2) - (j * 2) - 3; s++)
			{
				cout << "*";

			}
			cout << endl;
		}
		return 0;
	}