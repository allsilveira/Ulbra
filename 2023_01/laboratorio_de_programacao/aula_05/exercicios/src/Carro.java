/*
Exercício 2: Classe "Carro"
Crie uma classe chamada "Carro" que representará um carro. Esta classe deve ter:
Três atributos privados: "marca" (String), "modelo" (String) e "ano" (int).
Métodos públicos para obter (get) e definir (set) os valores dos atributos.
 */

public class Carro {
    private String brand;
    private String model;
    private int year;

    public Carro(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return this.brand;
    }
    public String getModel() {
        return this.model;
    }
    public int getYear() {
        return this.year = year;
    }

    public void setBrand() {
        this.brand = brand;
    }
    public void setModel() {
        this.model = model;
    }
    public void setYear() {
        this.year = year;
    }

}
