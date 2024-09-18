import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("AP1\n");
        // Exercício 1
        // a) Preenchimento da matriz
        System.out.println("Digite a quantidade de colunas:");
        int columns = scanner.nextInt();

        System.out.println("Digite a quantidade de linhas:");
        int rows = scanner.nextInt();

        Matriz matriz = new Matriz(rows, columns);

        System.out.println("Opções:");
        System.out.println("[1] Inserir um novo número na tabela");
        System.out.println("[2] Remover número da tabela");
        System.out.println("[3] Mostrar tabela");
        System.out.println("[4] Ordenar linhas da tabela");
        System.out.println("[5] Ordenar colunas da tabela");
        System.out.println("[6] Ordenar linhas e colunas da tabela");
        System.out.println("[7] Ordenar tabela completa");
        System.out.println("[8] Preencher a tabela com números aleatórios");
        System.out.println("[9] Encerrar programa");
        int response = scanner.nextInt();

        switch (response) {
            case 1:
                System.out.println("Digite um número:");
                int number = scanner.nextInt();
                matriz.add(number);
                break;

            case 2:
                System.out.println("Digite o número da linha:");
                int row = scanner.nextInt();

                System.out.println("Digite o número da coluna:");
                int colunm = scanner.nextInt();

                matriz.remove(row, colunm);
                break;

            case 3:
                System.out.println(matriz);
                break;

            case 4:
                matriz.mergeSort(MergeSortOptions.ROW);
                break;

            case 5:
                matriz.mergeSort(MergeSortOptions.COLUMN);
                break;

            case 6:
                matriz.bubbleSort();
                break;

            case 7:
                System.out.println("Funcionalidade em desenvolvimento.");
                break;

            case 8:
                for (int i = 0; i < matriz.getIntegers().length; i++) {
                    for (int y = 0; y < matriz.getIntegers()[i].length; y++) {
                        int randomNumber = random.nextInt(1, 100);

                        matriz.add(randomNumber);
                    }
                }
                break;

            case 9:
                System.out.println("Programa encerrado.");
                break;

            default:
                System.out.println("Programa encerrado.");
                break;
        }
    }
}
