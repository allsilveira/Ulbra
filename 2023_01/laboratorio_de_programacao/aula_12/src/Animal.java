public abstract class Animal {
    public abstract void eat();
    public abstract void sleep();
    public abstract void move();
}

class Dog extends Animal {
    public void eat() {
        System.out.println("Cachorro comendo");
    }
    public void sleep() {
        System.out.println("Cachorro dormindo");
    }
    public void move() {
        System.out.println("Cachorro andando");
    }
}

class Cat extends Animal {
    public void eat() {
        System.out.println("Gato comendo");
    }
    public void sleep() {
        System.out.println("Gato dormindo");
    }
    public void move() {
        System.out.println("Gato andando");
    }
}

class Fish extends Animal {
    public void eat() {
        System.out.println("Peixe comendo");
    }
    public void sleep() {
        System.out.println("Peixe dormindo");
    }
    public void move() {
        System.out.println("Peixe nadando");
    }
}

