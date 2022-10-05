#include <stdio.h>
#include <locale.h>
#include <windows.h>

int main(){
    UINT CPAGE_UTF8 = 65001;
    UINT CPAGE_DEFAULT = GetConsoleOutputCP();
    SetConsoleOutputCP(CPAGE_UTF8);
    SetConsoleOutputCP(CPAGE_DEFAULT);

    int n1, n2, n3;
    printf("Digite o primeiro número: ");
    scanf("%d%*c", &n1);
    printf("Digite o segundo número: ");
    scanf("%d%*c", &n2);
    printf("Digite o terceiro número: ");
    scanf("%d%*c", &n3);

    if (n1>n2 && n1>n3){
        printf("O maior número é o %d", n1);
    }else if (n2>n1 && n2>n3){
        printf("O maior número é o %d", n2);
    } else if (n3>n2 && n3>n1){
        printf("O maior número é o %d", n3);
    } else{
        printf("Números iguais");
    }
}