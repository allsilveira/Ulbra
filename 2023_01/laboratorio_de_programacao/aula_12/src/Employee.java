public abstract class Employee {
    public abstract void calculateSalary();
    public abstract void makeTask();
}

class Manager extends Employee {
    public void calculateSalary() {
        System.out.println("Salário do gerente: R$");
    }
    public void makeTask() {
        System.out.println("Gerente: realizando tarefa");
    }
}

class Seller extends Employee {
    public void calculateSalary() {
        System.out.println("Salário do vendedor: R$");
    }
    public void makeTask() {
        System.out.println("Vendedor: realizando tarefa");
    }
}

class Trainee extends Employee {
    public void calculateSalary() {
        System.out.println("Salário do estagiário: R$");
    }
    public void makeTask() {
        System.out.println("Estagiário: realizando tarefa");
    }
}
