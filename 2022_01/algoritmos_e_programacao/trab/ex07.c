#include <stdio.h>
#include <locale.h>
#include <windows.h>

int main(){
    UINT CPAGE_UTF8 = 65001;
    UINT CPAGE_DEFAULT = GetConsoleOutputCP();
    SetConsoleOutputCP(CPAGE_UTF8);
    SetConsoleOutputCP(CPAGE_DEFAULT);
    
    int a,b,c,i;
    printf("Digite um valor para A: ");
    scanf("%d%*c", &a);
    printf("Digite um valor para B: ");
    scanf("%d%*c", &b);
    printf("Digite um valor para C: ");
    scanf("%d%*c", &c);
    printf("Digite um valor para I (1, 2 ou 3):");
    scanf("%d%*c", &i);
    if(i==1){
        if (a<b && a<c){
            if (b<c){
                printf("A ordem crescente dos números é %d - %d- %d", a, b, c);
            }else{
                printf("A ordem crescente dos números é %d - %d- %d", a, c, b);
            }
        }
        if (b<a && b<c){
            if (a<c){
                printf("A ordem crescente dos números é %d - %d- %d", b, a, c);
            }else{
                printf("A ordem crescente dos números é %d - %d- %d", b, c, a);
            }
        }
        if (c<a && c<b){
            if (a<b){
                printf("A ordem crescente dos números é %d - %d- %d", c,a,b);
            }else{
                printf("A ordem crescente dos números é %d - %d- %d",c,b,a);
            }
        }
    }
    if (i==2){
        if (a>b && a>c){
            if (b>c){
                printf("A ordem decrescente dos números é %d - %d- %d", a, b, c);
            }else{
                printf("A ordem decrescente dos números é %d - %d- %d", a, c, b);
            }
        }
        if (b>a && b>c){
            if (a>c){
                printf("A ordem decrescente dos números é %d - %d- %d", b,a,c);
            }else{
                printf("A ordem decrescente dos números é %d - %d- %d",b,c,a);
            }
        }
        if(c>a && c>b){
            if (a>b){
                printf("A ordem decrescente dos números é %d - %d- %d",c,a,b);
            }else{
                printf("A ordem decrescente dos números é %d - %d- %d", c,b,a);
            }
        }
    }
    if (i==3){
        if (a>b && a>c){
            printf("A ordem é %d - %d - %d", b,a,c);
        }
        if(b>a && b>c){
            printf("A ordem é %d - %d - %d", a,b,c);
        }
        if(c>a && c>b){
            printf("A ordem é %d - %d - %d", a,c,b);
        }
    }
}