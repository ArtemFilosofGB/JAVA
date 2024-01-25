package API_GB.Lesson_2;
import java.io.IOException;
import java.util.logging.*;

public class Ex005_Logger {
    public static void main(String[] args) throws IOException {

        //Консоль хэндлер
        Logger logger = Logger.getLogger(Ex005_Logger.class.getName());
        //ConsoleHandler ch = new ConsoleHandler();
        //logger.addHandler(ch);


        //Файл хэндлер
        FileHandler fh = new FileHandler("src/main/java/API_GB.Lesson_2/log.txt");
        logger.addHandler(fh);

        //Установка фомата логирования
        SimpleFormatter sFormat = new SimpleFormatter(); // текстовый формат
        fh.setFormatter(sFormat);

//        XMLFormatter xml = new XMLFormatter();//XML формат
//        fh.setFormatter(xml);
        
        //logger.setLevel(Level.INFO);
        logger.log(Level.WARNING, "Тестовое логирование 1");
        logger.info("Тестовое логирование 2");

    }
}







