#include <stdio.h>
#include <string.h>
#include <windows.h>

int main()
{
    UINT CPAGE_UTF8 = 65001;
    SetConsoleOutputCP(CPAGE_UTF8);

    float nota1[10], nota2[10], media[10];
    int op, j = 0, adicionarAluno=1, notaUsuario, posicao;
    char nome[10];

    while (adicionarAluno == 1)
    {

        printf("Digite seu nome: ");
        scanf("%s%*c", &nome[j]);

        printf("Digite a primeira nota: ");
        scanf("%f%*c", &nota1[j]);

        printf("Digite a segunda nota: ");
        scanf("%f%*c", &nota2[j]);

        media[j] = (nota1[j] + nota2[j]) / 2;
        j++;
        if (j == 10)
        {
            break;
        }

        printf("Adicionar novo aluno?\n");
        printf("Digite 1 para SIM \n Digite 2 para NÃO");
        scanf("%d%*c", &adicionarAluno);
    }

    printf("\n----------------------------------------------------\n");
    printf("* Menu *\n");
    printf("----------------------------------------------------");
    printf("\nO que deseja fazer?\n");
    printf("1 - Listar alunos aprovados.\n");
    printf("2 - Listar alunos reprovados.\n");
    printf("3 - Listar todos os alunos com nota maior que uma nota informada pelo usuário.\n");
    printf("4 - Informar uma posição e o programa exibir os dados e notas do aluno.\n");
    printf("5 - Encerrar o programa.\n");
    scanf("%d%*c", &op);
    printf("\n\n\n");

    switch (op)
    {
    case 1:
        printf("Alunos aprovados:");
        for (int i = 0; i < j; i++)
        {
            if (media[i] >= 7)
            {
                printf("%d - %s", (i + 1), nome[i]);
            }
        }
        break;

    case 2:
        printf("Alunos reprovados:");
        for (int i = 0; i < j; i++)
        {
            if (media[i] < 7)
            {
                printf("%d - %s", (i + 1), nome[i]);
            }
        }
        break;

    case 3:
        printf("Digite uma nota: ");
        scanf("%d%c", &notaUsuario);
        printf("Alunos com nota maior que a nota digitada: ");
        for (int i = 0; i < j; i++)
        {
            if (media[i] > notaUsuario)
            {
                printf("%d - %s", (i + 1), nome[i]);
            }
        }
        break;

    case 4:
        printf("Digite uma posição: ");
        scanf("%d%*c", &posicao);
        for (int i = 0; i < j; i++)
        {
            if (posicao == i)
            {
                printf("Aluno: \n", nome[i]);
                printf("Primeira nota: \n", nota1[i]);
                printf("Segunda nota: \n", nota2[i]);
                printf("Média: \n", media[i]);
            }
        }
        break;

    case 5:
        exit(0);
        break;
    }
}