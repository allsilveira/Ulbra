
#include <stdio.h> 
int main(){
  int n1, n2;
  char opcao;
do
{
    printf("\nDigite o valor de n1:");
    scanf("%d%*c",&n1);
        printf("\nDigite o valor de n2:");
        scanf("%d%*c",&n2);
        if(n1>n2){
            printf("\n%d - %d \nDECRESCENTE\n", n1, n2);
        }else if(n1<n2){
            printf("\n%d - %d \nCRESCENTE\n", n1, n2);
        }else{
            printf("\n%d - %d \nVALORES IGUAIS\n", n1, n2);
        }
        printf("\nDeseja efetuar novo calculo? [s/n]\n");
        scanf("%c%*c",&opcao);
        }while ((opcao=='s')||(opcao=='S'));
}