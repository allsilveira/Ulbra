#include <stdio.h>

//Faça um programa que receba o salário base de um funcionário, calcule e mostre seu salário a receber, sabendo-se que o funcionário tem gratificação de R$ 50 e paga imposto de 10% sobre o salário base.

int main (){
    float sal, salreceber, imp;
    printf("Digite seu salário:\n");
    scanf("%f%*c",&sal);
    imp= sal *10/100;
    salreceber= sal+50-imp;
    printf("Seu salário a receber é de: %f", salreceber);
}