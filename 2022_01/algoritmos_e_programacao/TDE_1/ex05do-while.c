#include <stdio.h>

/*Faça um programa que leia um número N, e realize a soma dos números de 1 a N. Ao final, deve-se escrever o resultado. Esse algoritmo deve ser feito duas vezes uma usando o While e Do-While*/

int main(){
    int n,i,soma;
    soma=0;
    i=1;
  
        printf("Digite o numero \n");
        scanf("%d%*c",&n);
        do{  
            soma=i+soma;
            i++;
        }while (i<=n);
       printf("A soma de 1 até %d é %d\n",n,soma);
}