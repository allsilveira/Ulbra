#include <stdio.h>

/*Faça um programa que receba o peso de uma pessoa em quilos, calcule e mostre esse peso em gramas.*/

int main(){
    float peso, gramas;
    printf("Digite seu peso em quilos: ");
    scanf("%f%*c", &peso);
     
    gramas= peso*1000;

    printf("Seu peso em gramas é igual a %f gramas.", gramas);

}