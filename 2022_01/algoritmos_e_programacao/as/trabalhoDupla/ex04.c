#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(){
  int op, i, vet[5]={1,2,3,4,5};

  printf("----------------------------------------------------\n");
  printf("Alessandra Da Silveira, Ulbra Torres - RS\n");
  printf("----------------------------------------------------\n");
  printf("Clique ENTER para continuar...\n\n");
  getchar();

while(op!=0){
    printf("\n\n----------------------------------------------------\n");
    printf("**Menu**\n");
    printf("----------------------------------------------------");
    printf("\nO que deseja fazer?\n1 - Mostrar vetor \n2 - Mostrar vetor invertido \n0 - sair\n\n");
    scanf("%i",&op);
    printf("\n\n\n");
    switch(op){
      case 1:
        for(i=0; i<5; i++){
          printf("%d, ", vet[i]);
        }
      break;

      case 2:
        for(i=4; i>=0; i--){
          printf("%d, ", vet[i]);
          }
      break;

      default:
        printf("Digite um valor valido");
      break;
    }
  }
  return 0;
}
