#include <stdio.h>

int main (){
    int num, r;
    printf("Digite um número: ");
    scanf("%d%*c", &num);
    r= num%2;
    if (r=0){
        printf("O número é par.");
    }else{
        printf("O número é ímpar.");
    }

}