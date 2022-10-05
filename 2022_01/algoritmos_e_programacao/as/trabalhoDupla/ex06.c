#include <stdio.h>
#include <stdlib.h>

int main() {

  int i;
  int p;
  int vet1[5] = {};
  int vet2[5] = {};

  for(i = 0; i < 5; i++){
    printf("Digite um numero: ");
    scanf("%d%*c", &vet1[i]);
    for(p = 0; p < 5; p++){
      if(vet2[p] == vet1[i]){
        printf("Numero repetido. Digite outro: \n");
        scanf("%d%*c", &vet1[i]);
      }
      vet2[p] = vet1[i];
    }
  }

  printf("Numeros digitados: ");
  for(i = 0; i < 5; i++){
    printf("%d, ", vet1[i]);
  }
}