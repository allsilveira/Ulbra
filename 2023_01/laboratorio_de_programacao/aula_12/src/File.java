public abstract class File {
    public abstract void open();
    public abstract void close();
}

class TextFile extends File {
    public void open() {
        System.out.println("Abrindo arquivo de texto");
    }
    public void close() {
        System.out.println("Fechando arquivo de texto");
    }
}

class ImageFile extends File {
    public void open() {
        System.out.println("Abrindo arquivo de imagem");
    }
    public void close() {
        System.out.println("Fechando arquivo de imagem");
    }
}

class AudioFile extends File {
    public void open() {
        System.out.println("Abrindo arquivo de áudio");
    }
    public void close() {
        System.out.println("Fechando arquivo de áudio");
    }
}
