#include <stdio.h>

/*Efetue um programa que mostre todos os números inteiros ímpares situados numa  faixa de dois números digitados pelo usuário. Esse algoritmo deve ser feito duas vezes uma usando o WHILE e DO-WHILE*/

int main()
{
    int n1, n2;
    printf("digite o primeiro numero: \n");
    scanf("%d", &n1);
    printf("digite o segundo numero: \n");
    scanf("%d", &n2);

    do
    {
        if (n1 % 2 != 0)
        {
            printf("numero impar:%d \n", n1);
        }
        n1++;
    } while (n1 <= n2);
}