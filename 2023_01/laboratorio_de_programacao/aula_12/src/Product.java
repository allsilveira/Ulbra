public abstract class Product {
    public abstract void calculatePrice();
    public abstract void showDetails();
}

class Book extends Product {
    public void calculatePrice() {
        System.out.println("Preço do livro: R$");
    }
    public void showDetails() {
        System.out.println("Detalhes do livro");
    }
}

class Clothing extends Product {
    public void calculatePrice() {
        System.out.println("Preço da roupa: R$");
    }
    public void showDetails() {
        System.out.println("Detalhes da roupa");
    }
}

class Eletronic extends Product {
    public void calculatePrice() {
        System.out.println("Preço do produto eletrônico: R$");
    }
    public void showDetails() {
        System.out.println("Detalhes do produto eletrônico");
    }
}
