#include <stdio.h>
#include <locale.h>
#include <windows.h>

int main(){
    UINT CPAGE_UTF8 = 65001;
    UINT CPAGE_DEFAULT = GetConsoleOutputCP();
    SetConsoleOutputCP(CPAGE_UTF8);
    SetConsoleOutputCP(CPAGE_DEFAULT);

    int idade;
    printf("Digite sua idade: ");
    scanf("%d%*c", &idade);

    if (idade < 18 ){
        printf("Você é menor de idade.");
    }else{
        printf("Você é maior de idade.");
    }
}
