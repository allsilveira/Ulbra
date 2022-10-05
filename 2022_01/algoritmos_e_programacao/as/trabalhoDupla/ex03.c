#include <stdio.h>
#include <stdlib.h>

int main() {
    int i=0, p=0, vet[10];

    for(i=0; i<10; i++){
        printf("Digite um valor para a posição %d: ", i);
        scanf("%d", &vet[i]);
    }

    for(i=0; i<10; i++){
        for(p=i+1; p<10; p++){
            if(vet[i]==vet[p]){
                printf("\nO número %d está repetindo.\n", vet[i]);
            }
        }
    }

    return 0;
}