#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h> 
#include <string.h> 
#include <stdlib.h>

int main(void)
{
    char* s1 = "Take a look!";
    char* s2 = (char*)malloc(strlen(s1) + 1);

    strcpy(s2, s1);

    printf("%s\n", s2);

    if (s2 != NULL)free(s2);

    return 0;
}