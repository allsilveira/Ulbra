import java.util.Date;

public class Book {
    String isbn;
    int pagesNumber;
    private String name;
    public void setName(String name) {
        this.name = name;
    }
    public void getName(){
        return name;
    }
    public void toLoan(int days) {System.out.println("Emprestado por " + days + " dias.");
    }
    public Date toLoan(Date date) {
        return date;
    }
    public void toLoan(Client client, Date date) {

    }
    public void giveBack(int days) {
        System.out.println("Será devolvido depois de " + days + " dias.");
    }

}
