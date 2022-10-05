#include <stdio.h>

/*Faça um programa que calcule e mostre a área de um trapézio. Sabe-se que: A=((base maior + base menor) * altura) /2*/

int main(){
    int bMaior, bMenor, altura, area;
    printf("Digite o valor da base maior: ");
    scanf("%d%*c", &bMaior);
    printf("Digite o valor da base menor: ");
    scanf("%d%*c", &bMenor);
    printf("Digite o valor da altura: ");
    scanf("%d%*c", &altura);

    area = ((bMaior+bMenor)*altura)/2;
    printf("A área do trapézio é %d.", area);

}