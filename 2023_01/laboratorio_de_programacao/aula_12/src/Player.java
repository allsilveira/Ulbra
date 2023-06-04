public abstract class Player {
    public abstract void attack();
    public abstract void defend();
}

class Attacker extends Player {
    public void attack() {
        System.out.println("Atacante atacando");
    }
    public void defend() {
        System.out.println("Atacante defendendo");
    }
}

class MidField extends Player {
    public void attack() {
        System.out.println("Meio campo atacando");
    }
    public void defend() {
        System.out.println("Meio campo defendendo");
    }
}

class Goalkeeper extends Player {
    public void attack() {
        System.out.println("Goleiro atacando");
    }
    public void defend() {
        System.out.println("Goleiro defendendo");
    }
}



