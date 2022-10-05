#include <stdio.h>

int main (){
    int nota1, nota2, nota3, media, nota_exame;
    printf("Digite a primeira nota:");
    scanf("%d%*c", &nota1);
    printf("Digite a segunda nota:");
    scanf("%d%*c", &nota2);
    printf("Digite a terceira nota:");
    scanf("%d%*c", &nota3);
    media = (nota1+nota2+nota3)/3;
    printf("Média numérica: %d", media);
    if (media >= 0 && media <3){
        printf("Reprovado");
    }
    if (media >=3 && media <7){
        printf("Exame");
        nota_exame = 12 -media;
        printf("Deve tirar nota %d para ser aprovado", nota_exame);
    }
    if (media >=7 && media <=10){
        printf("Aprovado");
    }

}