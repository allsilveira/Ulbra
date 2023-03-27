public class Main {
    public static void main(String[] args) {
        Pessoa person = new Pessoa("Alessandra", 20, 1.74);
        System.out.println("Nome: " + person.getName());
        System.out.println("Idade: " + person.getAge());
        System.out.println("Altura: " + person.getHeight());

        Carro car = new Carro("Chevrolet", "Onix", 2015);
        System.out.println("Marca: " + car.getBrand());
        System.out.println("Modelo: " + car.getModel());
        System.out.println("Ano: " + car.getYear());

        ContaBancaria account = new ContaBancaria("12345", 1200, person);
        System.out.println(account.getBalance());
        System.out.println(account.deposit(200));
        System.out.println(account.withdraw(200));
    }
}