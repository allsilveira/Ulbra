#include <stdio.h>

/*Faça um programa que leia a matrícula, o nome e às três notas de 10 alunos, e indique para cada aluno, se ele foi aprovado ou não, considere a media 7*/

int main()
{
    int TAMANHO = 10;
    int matricula;
    char nome[10];
    float nota, media, soma;
    int i, j;
    for (i = 0; i < TAMANHO; i++)
    {
        printf("Digte a matricula\n");
        scanf("%d%*c", &matricula);
        printf("Digte a nome\n");
        scanf("%s%*c", &nome);
        soma = 0;
        for (j = 0; j < 3; j++)
        {
            printf("Digte a nota %d\n", (j + 1));
            scanf("%f%*c", &nota);
            soma = nota + soma;
        }
        media = soma / 3;
        if (media >= 7)
        {
            printf(" \nParabéns! %s você esta aprovado %.2f\n", nome, media);
        }
        else
        {
            printf(" \nOpa!! %s você esta reprovado %.2f\n", nome, media);
        }
    }
}