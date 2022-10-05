#include <stdio.h>

//Faça um programa que receba o salário base de um funcionário, calcule e mostre o salário a receber, sabendo-se que o funcionário tem gratificação de 5% sobre o salário e paga imposto de 7% também sobre o salário base.

int main (){
    float sal, salreceber, grat, imp;
    printf("Digite seu salário:\n");
    scanf("%f%*c", &sal);
    grat = sal*5/100;
    imp= sal*7/100;
    salreceber= sal+grat-imp;
    printf("Seu salário a receber é de: %f", salreceber);
}