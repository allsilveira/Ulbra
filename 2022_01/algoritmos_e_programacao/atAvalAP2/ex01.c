#include <stdio.h>
#include <math.h>
#include <windows.h>

int main(){
UINT CPAGE_UTF8 = 65001;
UINT CPAGE_DEFAULT = GetConsoleOutputCP();
SetConsoleOutputCP(CPAGE_UTF8);
    
    int idade;
    printf("Digite sua idade: ");
    scanf("%d%*c", &idade);

    if (idade <= 16 || idade >= 70){
        printf("Voto facultativo.");
    } else if (idade <16){
        printf("Você não possui idade suficiente para votar.");
    } else{
        printf("Voto obrigatório.");
    }
}