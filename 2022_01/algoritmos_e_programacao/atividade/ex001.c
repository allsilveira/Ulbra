#include <stdio.h>

int main (){
    int nota_trab, aval_sem, exame, media;
    printf("Digite a nota do trabalho do laboratório: ");
    scanf("%d%*c",&nota_trab);
    printf("Digite a nota da avaliação semestral: ");
    scanf("%d%*c",&aval_sem);
    printf("Digite a nota do exame final: ");
    scanf("%d%*c", &exame);
    media= (nota_trab *2 + aval_sem *3 + exame *5)/10;
    printf("Média ponderada: %d", media);
    if (media >= 8 && media <= 10){
        printf("Obteve conceito A");
    }
    if (media >=7 && media <8){
        printf("Obteve conceito B");
    }
    if (media >=6 && media <7){
        printf("Obteve conceito C");
    }
    if (media >=5 && media <6){
        printf("Obteve conceito D");
    }
    if (media >= 0 && media <5){
        printf("Obtece conceito E");
    }
}