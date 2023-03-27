/*
Exercício 1: Classe "Pessoa"
Crie uma classe chamada "Pessoa" que representará uma pessoa. Esta classe deve ter:
Três atributos privados: "nome" (String), "idade" (int) e "altura" (double).
Métodos públicos para obter (get) e definir (set) os valores dos atributos.
*/

public class Pessoa {
    private String name;
    private int age;
    private double height;

    public Pessoa(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public double getHeight() {
        return this.height;
    }
    public void setName() {
        this.name = name;
    }
    public void setAge() {
        this.age = age;
    }
    public void setHeight() {
        this.height = height;
    }

}
