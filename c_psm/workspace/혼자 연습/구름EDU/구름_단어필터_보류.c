#include<stdio.h>
#include<string.h>
void main() {
	int lengthS = 0, lengthE = 0;
	char* S = 0;
	char* E = 0;

	scanf_s("%d %d", &lengthS, &lengthE);

	S = (char*)calloc(lengthS, sizeof(char));
	E = (char*)calloc(lengthE, sizeof(char));

	scanf_s("%s", S, lengthS+1);
	scanf_s("%s", E, lengthE+1);

	char* save = 0;
	save = (char*)calloc(lengthS+1, sizeof(char));
	for (int i = 0; i < lengthE; i++) {
	int iTemp = 0;
	int cnt = 0;
		while(E[i]==S[0]){
				iTemp = i;
			while(cnt!=lengthS){
				save[cnt] = E[iTemp];
				cnt++;
				iTemp++;
			}
			printf("중간점검 save 이름 : %s\n", save);
			printf("중간점검 save 길이 : %d\n", strlen(save));
			printf("%d\n", strcmp(S, save));
			if (!strcmp(S, save)) {
				for (int j = 0; j < lengthS; j++) {
					if (E[i + lengthS] == 0) { E[i + j] = 0; }
					else { E[i + j] = E[i + lengthS + j]; }
					

				//	if (E[0] != 0) { E[i + lengthS+2] = 0; }
				}	
					break;
			}
			else { break; }
		}
	}

	E[0]==0 ? printf("EMPTY") : printf("%s\n", E);
}