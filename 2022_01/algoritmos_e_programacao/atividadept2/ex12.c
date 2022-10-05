#include  <stdio.h>
#include <math.h>


int  main () {
 
  int numero1, numero2;

  printf ("Digite um numero: " );
  scanf ("%d%*c", &numero1);
  printf ("Digite um numero: " );
  scanf (" %d%*c", &numero2);
  
  int resultado = pow (numero1, numero2);
  printf ("O número %d elevado ao número %d é igual a: %d \n " , numero1, numero2, resultado);
}