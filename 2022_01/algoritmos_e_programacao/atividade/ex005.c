#include <stdio.h>

int main (){
    int num1, num2, num3, num4;
    printf("Digite três números em ordem crescente:");
    scanf("%d%*c", &num1);
    scanf("%d%*c", &num2);
    scanf("%d%*c", &num3);
    printf("Digite um número (fora de ordem):");
    scanf("%d%*c", &num4);
    if (num4>num3){
        printf("A ordem decrescente é %d - %d - %d - %d", num4, num3, num2, num1);
    }
    if (num4>num2 && num4<num3){
        printf("A ordem decrescente é %d - %d - %d - %d", num3, num4, num2, num1);
    }
    if (num4>num1 && num4<num2){
        printf("A ordem decrescente é %d - %d - %d - %d", num3, num2, num4, num1);
    }
    if(num4<num1){
        printf("A ordem decrescente é %d - %d - %d - %d", num3, num2, num1, num4);
    }
}