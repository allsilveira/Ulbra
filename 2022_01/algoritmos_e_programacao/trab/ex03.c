#include <stdio.h>
#include <locale.h>
#include <windows.h>

int main(){
    UINT CPAGE_UTF8 = 65001;
    UINT CPAGE_DEFAULT = GetConsoleOutputCP();
    SetConsoleOutputCP(CPAGE_UTF8);
    SetConsoleOutputCP(CPAGE_DEFAULT);

    int n1, n2, dif;
    printf("Digite o primeiro número: ");
    scanf("%d%*c", &n1);
    printf("Digite o segundo número: ");
    scanf("%d%*c", &n2);

    if (n1>n2){
        dif = n1-n2;
        printf("A diferença de %d por %d é de %d", n1, n2, dif);
    }
    if (n1<n2){
        dif= n2-n1;
        printf("A diferença de %d por %d é de %d", n2, n1, dif);
    }
}