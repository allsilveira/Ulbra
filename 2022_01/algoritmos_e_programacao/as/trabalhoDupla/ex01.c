#include <stdio.h>
#include <stdlib.h>

int main(void) {
  int i=0, rep=0, href=0, vet[10];

  for(i=0; i<10; i++){
    printf("Digite o %d° numero:\n", i);
    scanf("%d", &vet[i]);
  }
  printf("Digite um valor de referencia:");
  scanf("%d", &href);

  printf("\nMaiores: ");
  for(i=0; i<10; i++){
    if(vet[i]>href){
      printf("%d, ", vet[i]);
      }
  }

  printf("\nMenores: ");
  for(i=0; i<10; i++){
    if(vet[i]<href){
      printf("%d, ", vet[i]);
    }
    if(href==vet[i]){
      rep++;
    }
  }

  printf("\nFoi repetido %d vezes.", rep);
  return 0;
}
