#include <stdio.h>

//Faça um programa que receba três notas, calcule e mostre a média aritmética.

int main(){
    float nota1, nota2, nota3, media;
    printf("Digite o valor da nota1:\n");
    scanf("%f%*c",&nota1);
    printf("Digite o valor da nota2:\n");
    scanf("%f%*c",&nota2);
    printf("Digite o valor da nota3:\n");
    scanf("%f%*c",&nota3);
    media= (nota1+nota2+nota3)/3;
    printf("A média é %f", media);
    
}