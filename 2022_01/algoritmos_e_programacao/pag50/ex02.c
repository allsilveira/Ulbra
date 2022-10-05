#include <stdio.h>

/*Faça um programa que receba três números, calcule e mostre a multiplicação desses números.*/

int main (){
    int n1, n2, n3, multi;
    printf("Digite o primeiro número: ");
    scanf("%d%*c", &n1);
    printf("Digite o segundo número: ");
    scanf("%d%*c", &n2);
    printf("Digite o terceiro número: ");
    scanf("%d%*c", &n3);
    multi= n1*n2*n3;
    printf("A multiplicação dos três números é igual a %d.", multi);
}