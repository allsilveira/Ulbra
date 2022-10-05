#include <stdio.h>
#include <math.h>

int main(){
    int n1, n2, n3, n4;
    printf("Digite o primeiro número: ");
    scanf("%d%*c", &n1);
    printf("Digite o segundo número: ");
    scanf("%d%*c", &n2);
    printf("Digite o terceiro número: ");
    scanf("%d%*c", &n3);
     printf("Digite o quarto número: ");
    scanf("%d%*c", &n4);

    if (n1%2==0 && n1%3==0){
        printf("%d é divisível por 2 e por 3.\n", n1);
    }else{
        printf("%d não é divisível por 2 e por 3.\n", n1);
    }
    if (n2%2==0 && n2%3==0){
        printf("%d é divisível por 2 e por 3.\n", n2);
    }else{
        printf("%d não é divisível por 2 e por 3.\n",n2);
    }
    if (n3%2==0 && n3%3==0){
        printf("%d é divisível por 2 e por 3.\n", n3);
    }else{
        printf("%d não é divisível por 2 e por 3.\n", n3);
    }
    if (n4%2==0 && n4%3==0){
        printf("%d é divisível por 2 e por 3.", n4);
    }else{
        printf("%d não é divisível por 2 e por 3.\n", n4);
    }
}
    