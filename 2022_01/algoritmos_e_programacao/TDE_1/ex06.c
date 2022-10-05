#include <stdio.h>

/*Efetue um programa que leia 5 números. Para cada número fornecido, escrever se ele é NULO, NEGATIVO ou POSITIVO*/

int main(){
    int numero;
    int i=0;
    for(i=0;i<5;i++){
    printf("Digite o numero\n");
    scanf("%d%*c",&numero);
    if(numero>0){
        printf( "Numero positivo!\n");
    }else if(numero<0){
        printf("Numero negativo!");
    }else{
        printf( "Numero nulo!");
    }
    }
}