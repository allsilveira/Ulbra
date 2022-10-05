#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <time.h>

int main() {
  int i=0, num=0, vet[10];

  srand(time(NULL));
  printf("Digite um numero, por favor: ");
  scanf("%d",&num);

  for(i=0; i<10; i++){
    vet[i]=rand() %10;
  }
  
  for(i=0; i<10; i++){ 
      printf("%d, ", vet[i]);
  }

  printf("\nO numero esta na posição: ");

  for(i=0; i<10; i++){ 
      if(num==vet[i]){
      printf("%d, ", i);
    }
  }

getch();
return 0;
}