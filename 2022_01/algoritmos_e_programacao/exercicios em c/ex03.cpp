#include <stdio.h>

//Faça um programa que receba três notas e seus respectivos pesos, calcule e mostre a média ponderada.

int main (){
    float nota1, nota2, nota3, peso1, peso2, peso3, media;
    printf("Digite o valor da nota1:\n");
    scanf("%f%*c",&nota1);
    printf("Digite o valor da nota2:\n");
    scanf("%f%*c",&nota2);
    printf("Digite o valor da nota3:\n");
    scanf("%f%*c",&nota3);

    printf("Digite o valor do peso1:\n");
    scanf("%f%*c",&peso1);
    printf("Digite o valor do peso2:\n");
    scanf("%f%*c",&peso2);
    printf("Digite o valor do peso3:\n");
    scanf("%f%*c",&peso3);

    media= (nota1*peso1+nota2*peso2+nota3*peso3)/(peso1+peso2+peso3);
    printf("A média ponderada é %f", media);
}