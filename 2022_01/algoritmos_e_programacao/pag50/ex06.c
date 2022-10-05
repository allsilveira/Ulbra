#include <stdio.h>

/*Um funcionário recebe um salário fixo mais 4% de comissão sobre as vendas. Faça um programa que recebao salário fixo do funcionário e o valor de suas vendas, calcule e mostre a comissão e seu salário final.*/

int main(){
    float sal, vendas, comis, novosal;
    printf("Digite o valor do seu salário: ");
    scanf("%f%*c", &sal);
    printf("Digite seu número de vendas: ");
    scanf("%f%*c", &vendas);

    comis= vendas*4/100;
    novosal= sal+comis;

    printf("Você recebeu uma comissão de %.2f e seu salário total é %.2f.", comis, novosal);
}