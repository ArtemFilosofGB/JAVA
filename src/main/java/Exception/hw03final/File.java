package Exception.hw03final;

import java.io.FileWriter;
import java.io.IOException;

public class File {
    public static void writeUserToFile(String fileName, User user) {
        try (FileWriter fw = new FileWriter(fileName, true);) {
            fw.write(user.toString());
            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Запись в файл "+ fileName +" успешно создана."+"\n");
    }
}
