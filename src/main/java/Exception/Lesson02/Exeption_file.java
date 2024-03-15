package Exception.Lesson02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Exeption_file {
    public static void main(String[] args) {
        FileReader file =null;
        try {
            file = new FileReader("src/main/java/README123.md");

        } catch (RuntimeException|FileNotFoundException e) {
            System.out.println("Исключение catch "+e.getClass().getSimpleName()); //Исключение catch FileNotFoundException

            try {
                FileWriter fr = new FileWriter("Errore.txt");
                fr.write(e.getMessage());
                fr.flush();
            } catch (IOException ex) {
                System.out.println("ERR! "+ex.getMessage());
            }


        }finally {
            System.out.println("finaly start");
            if (file != null) {
                try {
                    file.close();
                } catch (IOException e) {
                    System.out.println("Исключение по закрытию");
                }
            }
            System.out.println("finaly finish");
        }
    }
}
