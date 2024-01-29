package API_GB.Seminare_2.testFile;

import java.io.*;

public class TestFileWrite {
    public static void main(String[] args) throws IOException {
        //writeToFile();
        readFromFile();

    }

    private static void writeToFile() throws IOException {
        File file = new File("test_file.txt");
        try (FileWriter fileWriter = new FileWriter(file)) {

            fileWriter.write("Hello file!!!");

            fileWriter.append("\nqweqwe");

        }
    }

    private static void readFromFile() {
        File readfile = new File("test_file.txt");
        try {
            FileReader fileReader = new FileReader(readfile);

            // читаем посимвольно
            int c;
            while ((c = fileReader.read()) != -1) {

                System.out.print((char) c);
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }

    }
}
