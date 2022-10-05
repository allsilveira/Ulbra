#include <stdio.h>

/*Faça um programa que receba o peso de uma pessoa, calcule e mostre: a) o novo peso, se a pessoa engordar 15% sobre o peso digitado; b) o novo peso, se a pessoa emagrecer 20% sobre o peso digitado.*/

int main(){
    float peso, pesoEngordar, pesoEmagrecer;
    printf("Digite seu peso: ");
    scanf("%f%*c", &peso);

    pesoEngordar= peso + peso*15/100;
    pesoEmagrecer= peso - peso*20/100;

    printf("Se você engordar 15 porcento do seu peso atual, pesará %.3f.\n", pesoEngordar);
    printf("Se você emagrecer 20 porcento do seu peso atual, pesará %.3f. \n", pesoEmagrecer);  
}