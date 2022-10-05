#include <stdio.h>

/*Faça um programa que receba dois números, calcule e mostre a subtração do primeiro número pelo segundo.*/

int main(){
    int n1, n2, sub;
    printf("Digite o primeiro número: ");
    scanf("%d%*c", &n1);
    printf("Digite o segundo número: ");
    scanf("%d%*c", &n2);
    sub= n1-n2;
    printf("A subtração do primeiro número pelo segundo é igual a %d.", sub);
}