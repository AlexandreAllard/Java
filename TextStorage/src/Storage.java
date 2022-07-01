import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Storage {
    public String pathname;

    public Storage(String pathname) {
        this.pathname = pathname;
    }

    public String read(){
        try{
            FileReader fileReader = new FileReader(pathname);
            char[] monTexte = null;
            fileReader.read(monTexte);
        } catch (FileNotFoundException e) {
            System.out.println("Fichier non trouvé");

        } catch (IOException e) {
            System.out.println("Erreur de lecture");
        }

        return null;
    }

    public void write(String txt) throws IOException {
        try {
            FileWriter fileWriter = new FileWriter(pathname);
            fileWriter.write(txt);
            fileWriter.close();
        }catch(IOException e){
            System.out.println("Fichier incorrect");
        }
    }

}
