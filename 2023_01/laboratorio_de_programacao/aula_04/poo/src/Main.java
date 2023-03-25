import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Book book01 = new Book();
        book01.name = "Harry Potter";

        Book book02 = new Book();
        book02.name = "Código Limpo";

        System.out.println("Nome do livro 1: " + book01.name);
        System.out.println("Nome do livro 2: " + book02.name);
        Date date = new Date();
        book01.toLoan(10);
        var nowDate = book01.toLoan(date);
        System.out.println(nowDate);

        Client client01 = new Client();
        client01.name = "Ygor";
        client01.age = 26;
        client01.address = "Rua dos Alfeneiros";
    }
}