#include <stdio.h>

/*Faça um programa que calcule e mostre a área de um qudrado. Sabe-se que: A= lado*lado.*/

int main(){
    int lado1, lado2, area;
    printf("Digite o valor do primeiro lado: ");
    scanf("%d%*c", &lado1);
    printf("Digite o valor do segundo lado: ");
    scanf("%d%*c", &lado2);

    area= lado1*lado2;

    printf("A área do quadrado é %d.", area);

}
