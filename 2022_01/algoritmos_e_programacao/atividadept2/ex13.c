#include <stdio.h>
#include <math.h>

int main() {


  float pes, polegada, jarda, milha;
  printf("Digite uma medida em pes: ");
  scanf("%f%*c", &pes);

  polegada = pes * 12;
  jarda = pes / 3;
  milha = jarda / 1.760;

  printf("Em polegadas: %.1f\n", polegada);
  printf("Em jardas: %.1f\n", jarda);
  printf("Em milhas: %.1f\n", milha);
}