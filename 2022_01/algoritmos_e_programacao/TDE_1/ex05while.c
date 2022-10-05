#include <stdio.h>

int main(){
    int n, i, soma;
    soma = 0;
    i = 1;

    printf("Digite o numero \n");
    scanf("%d%*c", &n);
    i = 1;
    soma = 0;
    while (i <= n){
        soma = i + soma;
        i++;
    }

    printf("A soma de 1 até %d é %d\n", n, soma);
}