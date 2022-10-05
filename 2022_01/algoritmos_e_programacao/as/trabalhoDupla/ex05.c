#include <stdio.h>
#include <stdlib.h>

int main() {
  
  int vetA[10] = {};
  int vetB[10] = {};
  int vetC[10] = {};
  
  printf("Digite os valores do vetor A:\n");
  for(int i = 0; i < 10; i++) {
    printf("%dº posição: ", i+1);
    scanf("%d", &vetA[i]);
  }

  printf("Digite os valores do vetor B:\n");
  for(int i = 0; i < 10; i++) {
    printf("%dº posição: ", i+1);
    scanf("%d", &vetB[i]);
    vetC[i] = vetA[i] - vetB[i];
  }

  printf("Valores do vetor C: ");
  for(int i = 0; i < 10; i++) {
    printf("%d ", vetC[i]);
  }

}