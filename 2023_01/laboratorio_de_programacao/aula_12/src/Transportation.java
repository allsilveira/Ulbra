public abstract class Transportation {
    public abstract void toload();
    public abstract void unload();
}

class Truck extends Transportation {
    public void toload() {
        System.out.println("Carregando caminhão");
    }
    public void unload() {
        System.out.println("Descarregando caminhão");
    }
}

class Train extends Transportation {
    public void toload() {
        System.out.println("Carregando trem");
    }
    public void unload() {
        System.out.println("Descarregando trem");
    }
}

class Ship extends Transportation {
    public void toload() {
        System.out.println("Carregando navio");
    }
    public void unload() {
        System.out.println("Descarregando navio");
    }
}
