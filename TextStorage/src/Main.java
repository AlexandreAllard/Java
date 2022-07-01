import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Storage storage = new Storage("");
        storage.write("ceci est un texte");
        String texte = storage.read();
        System.out.println(texte);
    }
}
