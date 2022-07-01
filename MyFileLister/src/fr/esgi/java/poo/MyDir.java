package fr.esgi.java.poo;

import java.io.File;
import java.nio.file.Path;

public class MyDir {
    private String path;

    public MyDir(String s) {
        path = s;
    }

    public void lister(){
        File myDirectory = new File(path);
        File[] fichiers = myDirectory.listFiles();

        for (File unFichier : fichiers){
            if (unFichier.isFile()) {
                System.out.println(unFichier.getName() + ' ' + unFichier.length());
            } else {
                System.out.println(unFichier.getName());
            }
        }
    }
}
