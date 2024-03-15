package Exception.Seminare03.Task03;

import java.io.FileNotFoundException;

public class NonExistedFileException extends FileNotFoundException {
    public NonExistedFileException() {
        super("Файл не найден!!!");
    }

    public NonExistedFileException(String s) {
        super(s);
    }
}
