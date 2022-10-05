#include <stdio.h>

int main (){
    int num1, num2, num3;
    printf("Digite o primeiro número:");
    scanf("%d%*c", &num1);
    printf("Digite o segundo número:");
    scanf("%d%*c", &num2);
    printf("Digite o terceiro número:");
    scanf("%d%*c", &num3);
    if (num1 < num2 && num1 < num3){
        if (num2 < num3){
            printf("A ordem crescente é %d - %d - %d", num1, num2, num3);
        }else{
            printf("A ordem crescente é  %d - %d - %d", num1, num3, num2);
        }
    }
    if (num2<num1 && num2<num3){
        if (num1 < num3){
            printf("A ordem crescente é %d - %d - %d", num2, num1, num3);
        }else{
            printf("A ordem crescente é %d - %d - %d", num2, num3, num1);
        }
    }
    if(num3<num1 && num3<num2){
        if (num1<num2){
            printf("A ordem crescente é %d - %d - %d", num3, num1, num2);
        }else {
            printf("A ordem crescente é %d - %d - %d", num3, num2, num1);
        }
    }
}