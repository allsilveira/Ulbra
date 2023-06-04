public abstract class StorageDevice {
    public abstract void readData();
    public abstract void recordData();
}

class SSD extends StorageDevice {
    public void readData() {
        System.out.println("SSD lendo arquivos");
    }
    public void recordData() {
        System.out.println("SSD registrando arquivos");
    }
}

class HD extends StorageDevice {
    public void readData() {
        System.out.println("HD lendo arquivos");
    }
    public void recordData() {
        System.out.println("HD registrando arquivos");
    }
}