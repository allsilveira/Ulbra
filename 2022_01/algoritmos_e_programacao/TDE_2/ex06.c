
#include <stdio.h>
int main()
{
    int senha_certa = 1234, senha, tentativas = 0;

    do
    {
        printf("\n\n\nDigite a senha:");
        scanf("%d%*c", &senha);
        tentativas++;
        if (senha == senha_certa)
        {
            printf("ACESSO PERMITIDO          Numero de tentativas: %d", tentativas);
        }
        else
        {
            printf("ACESSO NEGADO          Numero de tentativas: %d", tentativas);
        }
    } while (senha != senha_certa);
}