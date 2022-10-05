#include <stdio.h>

int main(){
    int num1, num2;
    printf("Digite o primeiro número:");
    scanf("%d%*c", &num1);
    printf("Digite o segundo número:");
    scanf("%d%*c", &num2);
    if (num1 > num2){
        printf("O maior número é %d", num1);
    }
    if (num2 > num1){
        printf("O maior número é %d", num2);
    }
    if (num1 == num2){
        printf("Os dois números são iguais.");
    }
}