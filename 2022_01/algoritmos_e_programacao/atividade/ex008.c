#include <stdio.h>

int main(){
    int num1, num2, soma, raiz, op;
    printf("Menu");
    printf("1- Somar dois números");
    printf("2- Raiz quadrada de um número");
    printf("Digite uma opção:");
    scanf("%d%*c", &op);
    if(op=1){
        printf("Digite o valor para o primeiro número:");
        scanf("%d%*c", &num1);
        printf("Digite o valor para o segundo número:");
        scanf("%d%*c", &num2);
        soma = num1+num2;
        printf("A soma de %d e %d é %d", num1, num2, soma);
    }
    if (op=2){
        printf("Digite um valor:");
        scanf("%d%*c", &num1);
        raiz= sqrt(num1);
        printf("A raiz quadrada de %d é %d.", num1, raiz);
    }
    if(op != 1 && op != 2){
        printf("Opção inválida!");
    }
}