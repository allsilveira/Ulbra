#include <stdio.h>

int main(void)
{
    int tam = 10, i = 0;
    float soma = 0, numero = 0;

    do
    {
        printf("Digite o %dº número:\n", i + 1);
        scanf("%f%*c", &numero);
        soma = soma + numero;
        i++;
    } while (i < tam);

    printf("\n A soma é %.1f", soma);
}