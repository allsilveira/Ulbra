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
    if(n1 % 2 == 0){
        printf("%d é múltiplo de 2\n", n1);
    }else{
        printf("%d não é múltiplo de 2\n", n1);
    }
    if(n2 % 2 == 0){
        printf("%d é múltiplo de 2", n2);
    }else{
        printf("%d não é múltiplo de 2", n2);
    }
    
}