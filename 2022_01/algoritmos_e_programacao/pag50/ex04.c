#include <stdio.h>

/*Faça um programa que receba duas notas, calcule e mostre a média ponderada dessas notas, considerando peso 2 para a primeira e peso 3 para a segunda.*/

int main (){
    int nota1, nota2, mediaPond;
    printf("Digite a primeira nota: ");
    scanf("%d%c", &nota1);
    printf("Digite a segunda nota: ");
    scanf("%d%*c", &nota2);
    mediaPond= (nota1*2+nota2*3)/5;
    printf("Sua média poderada é %d", mediaPond);
}