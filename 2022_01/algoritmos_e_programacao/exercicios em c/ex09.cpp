#include <stdio.h>

//Faça um programa que calcule e mostre a área de um triângulo. Sabe-se que: Área = (base*altura)/2.

int main(){
    int base, altura, area;
    printf("Digite o valor da base: \n");
    scanf("%d%*c", &base);
    printf("Digite o valor da altura:\n");
    scanf("%d%*c", &altura);
    area = (base*altura)/3;
    printf("O valor da área é %d", area);

}