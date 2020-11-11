#include <stdio.h>
#include <stdlib.h>

int main()
{
    int n;
    printf("Enter a positive integer ---> ");
    do{
         scanf("%d", &n);
         printf("\n");
         if(n<0 ||n==0){
             printf("You must enter a positive number!!! \n");
             printf("Enter a positive integer ---> ");
         }

    }while(n<0 || n==0);


    printf("\n<--------- THE SEQUENCE IS ---------> \n");
    printf("%d \t",n);
    while(n != 1){
   if(n%2 == 0){
    n = n/2;
   }else{
       n = 3*n+1;
   }
   printf("%d",n);
   printf("\t");
    }

    printf("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

    return 0;

}
