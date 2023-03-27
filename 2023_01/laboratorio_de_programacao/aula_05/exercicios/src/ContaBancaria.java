/*
Exercício 3: Classe "ContaBancaria"
Crie uma classe chamada "ContaBancaria" que representará uma conta bancária. Esta classe deve ter:
Três atributos privados: "numeroConta" (String), "saldo" (double) e "titular" (Pessoa).
Métodos públicos para depositar (depositar), sacar (sacar) e consultar o saldo (getSaldo).
 */
public class ContaBancaria {
    private String accountNumber;
    private double balance;

    private Pessoa holder;

    public ContaBancaria(String accountNumber, double balance, Pessoa holder) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.holder = holder;
    }

    public String deposit(double value) {
        if(value <= 0){
            return "Valor de depósito inválido.";
        }
        this.balance += value;
        String message = "Valor depositado com sucesso. Saldo atual: R$ " + this.balance;
        return message;
    }

    public String withdraw(double value) {
        if(value <= 0){
            return "Valor de saque inválido.";
        }
        if(value > this.balance) {
            return "Valor de saque inválido.";
        }
        this.balance -= value;
        String message = "Valor sacado com sucesso. Saldo atual: R$ " + this.balance;
        return message;
    }

    public String getBalance() {
        String message = "Saldo atual: R$ " + this.balance;
        return message;
    }

}
