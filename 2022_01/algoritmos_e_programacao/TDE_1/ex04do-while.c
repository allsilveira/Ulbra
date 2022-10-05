#include <stdio.h>

/*Efetue um programa que leia a nota de 10 alunos de uma turma. Ao final, deve ser escrita a média geral da turma. Esse algoritmo deve ser feito duas vezes uma usando o FOR, e DO-WHILE*/

int main(){
    int TAMANHO = 3;
    int i;
    float soma, nota, media;
    i = 0;
    soma = 0;

    do{
        printf("Digite a nota %d\n", i + 1);
        scanf("%f%*c", &nota);
        soma = soma + nota;
        i++;
    } while (i < TAMANHO);

    media = soma / TAMANHO;
    printf("A média é %f", media);
}