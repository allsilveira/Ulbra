/*
Escreva um programa que imprime na saída os valores assumidos por x. Esta variável x deve
iniciar com algum valor escolhido por você. Se x for par, x deve receber o valor dele mesmo
somado com 5. Já se x for ímpar, x deve receber o valor dele multiplicado por 2. O programa
termina assim que x for maior que 1000.
Por exemplo, para x = 10, a saída deve ser: 15, 30, 35, 70, 75, 150, 155, 310, 315, 630, 635,
1270.
Crie este programa primeiro usando a estrutura de controle if-else e depois usando a
estrutura de controle switch.
*/
public class Main {
    public static void main(String[] args) {
        printX(10);
    }

    //com if-else
    public static void printX(int x) {
        while (x <= 1000) {
            System.out.println(x);
            if (x % 2 == 0) {
                x += 5;
            } else {
                x *= 2;
            }
        }
    }

    //com switch


}