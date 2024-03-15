package Exception.Lesson02;

public class Example02_1 {
    public static void main(String[] args) {
        int number =1;
        try{
            number= number/0;
            String test=null;
            System.out.println("test.length() = " + test.length());
        }catch (ArithmeticException e){
            System.out.println("Деление на ноль!!!");
        }catch (NullPointerException e){
            System.out.println("Null pointer!!!");
        }catch (Exception e){
            System.out.println("Exeption!!!");
        }
    }
}
