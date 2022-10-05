#include <stdio.h>
#include <locale.h>
#include <windows.h>

int main(){
    UINT CPAGE_UTF8 = 65001;
    UINT CPAGE_DEFAULT = GetConsoleOutputCP();
    SetConsoleOutputCP(CPAGE_UTF8);
    SetConsoleOutputCP(CPAGE_DEFAULT);

    int n1, n2;
    printf("Digite o primeiro número: ");
    scanf("%d%*c", &n1);
    printf("Digite o segundo número: ");
    scanf("%d%*c", &n2);

    if (n1==n2){
        printf("Números iguais!");
    } else if (n1>n2){
        printf("O maior número é %d.", n1);
    } else {
        printf("O maior número é %d.", n2);
    }

    

}