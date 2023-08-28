import com.ygorevaldt.calculatev2.calculate.basic.BasicCalculate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BasicCalculate basicCalculate = new BasicCalculate();

        System.out.println("Número: ");
        double number1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Operador");
        String stringOperator = scanner.nextLine();

        System.out.println("Número: ");
        double number2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println(String.format("Número 1: %.2f -- Número 2: %.2f -- Operador: %s", number1, number2, stringOperator));
    }
}