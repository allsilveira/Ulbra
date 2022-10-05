#include <stdio.h>

//Faça um programa que calcule e mostre a área de um círculo. Sabe-se que: área = pi * R².

int main (){
    float area, raio;
    printf("Digite o raio do círculo: \n");
    scanf("%f%*c",&raio);
    area= 3.1415 * (raio*raio);
    printf("O valor da área é de : %f", area);
}