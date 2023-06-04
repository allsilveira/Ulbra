public abstract class Printer {
    public abstract void print();
    public abstract void scan();
}

class InkjetPrinter extends Printer {
    public void print() {
        System.out.println("Impressora a jato imprimindo");
    }
    public void scan() {
        System.out.println("Impressora a jato escaneando");
    }
}

class LaserPrinter extends Printer {
    public void print() {
        System.out.println("Impressora a laser imprimindo");
    }
    public void scan() {
        System.out.println("Impressora a laser escaneando");
    }
}

class MatrixPrinter extends Printer {
    public void print() {
        System.out.println("Impressora matricial imprimindo");
    }
    public void scan() {
        System.out.println("Impressora matricial escaneando");
    }
}