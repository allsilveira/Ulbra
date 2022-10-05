#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <time.h>
#include <windows.h>

int main()
{
    UINT CPAGE_UTF8 = 65001;
    SetConsoleOutputCP(CPAGE_UTF8);

    int i = 0, vet[100], op = 0, maior = 0, cont = 0;

    printf("Gerando números...\n");

    srand(time(NULL));

    for (i = 0; i < 100; i++)
    {
        vet[i] = rand() % 1000;
        if (vet[i] == 999)
        {
            break;
        }
        if (i == 0)
        {
            vet[i] = maior;
        }
        if (vet[i] > maior)
        {
            maior = vet[i];
        }

        cont++;
    }

    do
    {
        printf("\n----------------------------------------------------\n");
        printf("* Menu *\n");
        printf("----------------------------------------------------");
        printf("\nO que deseja fazer?\n");
        printf("1 - Exibir uma lista dos números presentes no vetor, não incluído o 999.\n");
        printf("2 - Imprimir o vetor na ordem inversa.\n");
        printf("3 - Exibir o maior número.\n");
        printf("4 - Exibir quantos números foram sorteados.\n");
        printf("5 - Encerrar o programa.\n");
        scanf("%d*c", &op);
        printf("\n\n\n");

        switch (op)
        {
        case 1:
            for (i = 0; i < 100; i++)
            {
                printf("%d, ", vet[i]);
            }
            break;

        case 2:
            for (i = 99; i >= 0; i--)
            {
                printf("%d, ", vet[i]);
            }
            break;

        case 3:
            printf("Maior = %d \n", maior);
            break;

        case 4:
            printf("Números sorteados: %d", cont);
            break;

        case 5:
            exit(0);
            break;
        }

    } while (op <= 5);

    getch();
    return 0;
}
