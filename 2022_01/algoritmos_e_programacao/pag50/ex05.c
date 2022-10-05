#include <stdio.h>

/*Faça um programa que receba o preço de um produto, calcule e mostre o novo preço, asbendo-se que este sofeu um desconto de 10%.*/

int main(){
    float preco, novoP;
    printf("Digite o valor do produto: ");
    scanf("%f%*c", &preco);
    novoP= preco-preco*10/100;

    printf("Recebendo um desconto de 4 porcento, o valor do produto é %.2f.", novoP);

}