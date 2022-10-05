#include <stdio.h>

//Faça um programa que receba o valor de um depósito e o valor da taxa de juros, calcule e mostre o valor do rendimento e o valor total depois do rendimento.

int main(){
    float dep, taxa, rend, total;
    printf("Digite o valor do depósito: \n");
    scanf("%f%*c", &dep);
    printf("Digite o valor da taxa: \n");
    scanf("%f%*c", &taxa);
    rend= dep*taxa/100;
    total=dep+rend;
    printf("Valor do rendimento: %f", rend);
    printf("Valor tota: %f", total);

}
