#include <stdio.h>
#include <math.h>

int main(){
    float nota1, nota2, nota3, ma;
    printf("Digite a primeira nota: ");
    scanf("%f%*c", &nota1);
    printf("Digite a segunda nota: ");
    scanf("%f%*c", &nota2);
    printf("Digite a terceira nota: ");
    scanf("%f%*c", &nota3);

    ma= (nota1+nota2+nota3)/3;

    printf("Sua média de aproveitamento é %.1f\n", ma);

    if (ma>=9){
        printf("Conceito A. Aprovado!");
    } else if(ma>= 7.5 && ma< 9){
        printf("Conceito B. Aprovado!");
    }else if(ma>=6 && ma <7.5){
        printf("Conceito C. Aprovado!");
    }else if (ma >= 4 && ma<6){
        printf("Conceito D. Reprovado!");
    }else{
        printf("Conceito E. Reprovado!");
    }

}