package Exception.Seminare03.Task03;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Task03 {
    public static void main(String[] args) {
      //  divide(3,0);
        try {
            fileNotFind("path");
        } catch (NonExistedFileException e) {
            e.printStackTrace();
        }
    }
    public static double divide(int num1,int num2){
        if (num2==0)
            throw new DivideByZero();
        return num1/num2;
    }
    public static void fileNotFind(String path) throws NonExistedFileException
    {
        try {
            FileReader fr= new FileReader(path);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
