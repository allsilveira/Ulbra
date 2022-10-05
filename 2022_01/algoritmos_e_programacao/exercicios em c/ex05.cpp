#include <stdio.h>

//Faça um programa que receba o salário de um funcionário e o percentual de aumento, calcul e mostre o valor do aumento do número e o novo salário.

int main (){
    float sal, perc, aumento, novosal;
    printf("Digite seu salário: \n");
    scanf("%f%*c", &sal);
    printf("Digite o seu percentual de aumento: \n");
    scanf("%f%*c", &perc);
    aumento= sal * perc/100;
    printf("Seu aumento é de %f", aumento);
    novosal= sal+aumento;
    printf("Seu novo salário é de: %f", novosal);
}