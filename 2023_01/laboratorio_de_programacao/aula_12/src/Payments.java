public abstract class Payments {
    public abstract void makePayment();
    public abstract void emitReceipt();
}

class CredictCard extends Payments {
    public void makePayment() {
        System.out.println("Pagar com cartão de crédito");
    }
    public void emitReceipt() {
        System.out.println("Pagamento realizado com cartão de crédito");
    }
}

class DebitCard extends Payments {
    public void makePayment() {
        System.out.println("Pagar com cartão de débito");
    }
    public void emitReceipt() {
        System.out.println("Pagamento realizado com cartão de débito");
    }
}

class Money extends Payments {
    public void makePayment() {
        System.out.println("Pagar com dinheiro");
    }
    public void emitReceipt() {
        System.out.println("Pagamento realizado com dinheiro");
    }
}