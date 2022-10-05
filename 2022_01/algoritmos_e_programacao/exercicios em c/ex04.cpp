#include <stdio.h>

//Faça um programa que receba o salário de um funcionário, calcule e mostre o novo salário, sabendo-se que este sofreu um aumento de 25%.

int main (){
    float sal, novosal;
    printf("Digite seu salário:\n");
    scanf("%f%*c", &sal);
    novosal= sal + sal*25/100;
    printf("Seu novo salário é: %f",novosal);
}