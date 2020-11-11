#include <stdio.h>
#include <windows.h>
#include <string.h>
#include <stdbool.h>

#define DEST_SIZE 42

bool is_number(char * str)
{
    int i = 0;
    if(str[0] == '+' && str[1] != '\0') i = 1;
    while(str[i] != '\0')
    {
        if(!isdigit(str[i]))
            return false;
        i++;
    }
    return true;
}

int main(VOID){
    char str[20];
    do{
        printf("Entrer un nombre superieur a zero ---> ");
        scanf("%s", &str);
    }while(!is_number(str));

    char dest[DEST_SIZE] = "Process\\child.exe ";

    strcat(dest, str);

STARTUPINFO si;
PROCESS INFORMATION pi;
/* allocate memory */
ZeroMemory(&si, sizeof(si));
si.cb = sizeof(si);
ZeroMemory(&pi, sizeof(pi));
/* create child process */
if (!CreateProcess(NULL, /* use command line */
"C:\Users\PASCODEV\Desktop\Devoir3\bin\Debug", /* command */
NULL, /* don’t inherit process handle */
NULL, /* don’t inherit thread handle */
FALSE, /* disable handle inheritance */
0, /* no creation flags */
NULL, /* use parent’s environment block */
NULL, /* use parent’s existing directory */
&si,
&pi))
{
fprintf(stderr, "Create Process Failed");
return -1;
}
/* parent will wait for the child to complete */
WaitForSingleObject(pi.hProcess, INFINITE);
printf("Child Complete");
/* close handles */
CloseHandle(pi.hProcess);
CloseHandle(pi.hThread);
}
