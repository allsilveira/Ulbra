#include <stdio.h>

/*Faça um programa que receba dois números, calcule e mostre a divisão do primeiro número pelo segundo. Sabe-se que o segundo número não pode ser zero, portanto, não é necessário se preocupa com validações.*/

int main(){
    int n1, n2, div;
    printf("Digite o primeiro número: ");
    scanf("%d%*c", &n1);
    printf("Digite o segundo número: ");
    scanf("%d%*c", &n2);
    div=n1/n2;
    printf("O valor da divisão do primeiro número pelo segundo é %d.", div);
}